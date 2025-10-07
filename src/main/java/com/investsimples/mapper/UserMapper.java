package com.investsimples.mapper;

import com.investsimples.domain.User;
import com.investsimples.request.UserPostRequest;
import com.investsimples.request.UserPutRequest;
import com.investsimples.response.UserGetResponse;
import com.investsimples.response.UserPostResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    User toUser(UserPostRequest postRequest);

    User toUser(UserPutRequest request);

    UserPostResponse toUserPostResponse(User user);

    UserGetResponse toUserGetResponse(User user);

    List<UserGetResponse> toUserGetResponseList(List<User> users);

}