package com.investsimples.mapper;

import com.investsimples.domain.CoinGeckoData;
import com.investsimples.response.CoinGeckoDataGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CoinGeckoDataMapper {
    CoinGeckoDataMapper INSTANCE = Mappers.getMapper(CoinGeckoDataMapper.class);

    CoinGeckoDataGetResponse toCoinGeckoDataGetResponse(CoinGeckoData coinGeckoData);
}
