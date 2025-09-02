package com.investsimples.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public record CoinGeckoData(
        String id,
        String symbol,
        String name,

        @JsonProperty("web_slug")
        String webSlug,

        @JsonProperty("asset_platform_id")
        String assetPlatformId,

        Map<String, String> platforms,

        @JsonProperty("block_time_in_minutes")
        Integer blockTimeInMinutes,

        @JsonProperty("hashing_algorithm")
        String hashingAlgorithm,

        List<String> categories,

        @JsonProperty("preview_listing")
        Boolean previewListing,

        @JsonProperty("public_notice")
        String publicNotice,

        @JsonProperty("additional_notices")
        List<String> additionalNotices,

        Map<String, String> localization,
        Map<String, String> description,

        Links links,
        Image image,

        @JsonProperty("country_origin")
        String countryOrigin,

        @JsonProperty("genesis_date")
        String genesisDate,

        @JsonProperty("sentiment_votes_up_percentage")
        Double sentimentVotesUpPercentage,

        @JsonProperty("sentiment_votes_down_percentage")
        Double sentimentVotesDownPercentage,

        @JsonProperty("watchlist_portfolio_users")
        Integer watchlistPortfolioUsers,

        @JsonProperty("market_cap_rank")
        Integer marketCapRank,

        @JsonProperty("market_data")
        MarketData marketData,

        @JsonProperty("community_data")
        CommunityData communityData,

        @JsonProperty("developer_data")
        DeveloperData developerData,

        @JsonProperty("last_updated")
        LocalDateTime lastUpdated,

        List<Ticker> tickers
) {
    public record Links(
            List<String> homepage,
            @JsonProperty("blockchain_site") List<String> blockchainSite,
            @JsonProperty("official_forum_url") List<String> officialForumUrl,
            @JsonProperty("chat_url") List<String> chatUrl,
            @JsonProperty("announcement_url") List<String> announcementUrl,
            @JsonProperty("twitter_screen_name") String twitterScreenName,
            @JsonProperty("facebook_username") String facebookUsername,
            @JsonProperty("telegram_channel_identifier") String telegramChannelIdentifier,
            @JsonProperty("subreddit_url") String subredditUrl,
            @JsonProperty("repos_url") Map<String, List<String>> reposUrl
    ) {
    }

    public record Image(String thumb, String small, String large) {
    }

    public record MarketData(
            @JsonProperty("current_price") Map<String, Double> currentPrice,
            @JsonProperty("market_cap") Map<String, Double> marketCap,
            @JsonProperty("total_volume") Map<String, Double> totalVolume,
            Map<String, Double> ath,
            Map<String, Double> atl,
            @JsonProperty("price_change_24h") Double priceChange24h,
            @JsonProperty("price_change_percentage_24h") Double priceChangePercentage24h,
            @JsonProperty("price_change_percentage_7d") Double priceChangePercentage7d,
            @JsonProperty("price_change_percentage_30d") Double priceChangePercentage30d,
            @JsonProperty("price_change_percentage_1y") Double priceChangePercentage1y,
            @JsonProperty("total_supply") Double totalSupply,
            @JsonProperty("max_supply") Double maxSupply,
            @JsonProperty("circulating_supply") Double circulatingSupply,
            @JsonProperty("last_updated") String lastUpdated
    ) {
    }

    public record CommunityData(
            @JsonProperty("facebook_likes") Integer facebookLikes,
            @JsonProperty("reddit_average_posts_48h") Double redditAveragePosts48h,
            @JsonProperty("reddit_average_comments_48h") Double redditAverageComments48h,
            @JsonProperty("reddit_subscribers") Integer redditSubscribers,
            @JsonProperty("reddit_accounts_active_48h") Double redditAccountsActive48h,
            @JsonProperty("telegram_channel_user_count") Integer telegramChannelUserCount
    ) {
    }

    public record DeveloperData(
            Integer forks,
            Integer stars,
            Integer subscribers,
            @JsonProperty("total_issues") Integer totalIssues,
            @JsonProperty("closed_issues") Integer closedIssues,
            @JsonProperty("pull_requests_merged") Integer pullRequestsMerged,
            @JsonProperty("pull_request_contributors") Integer pullRequestContributors,
            @JsonProperty("code_additions_deletions_4_weeks") Map<String, Integer> codeAdditionsDeletions4Weeks,
            @JsonProperty("commit_count_4_weeks") Integer commitCount4Weeks
    ) {
    }

    public record Ticker(
            String base,
            String target,
            Market market,
            Double last,
            Double volume,
            @JsonProperty("converted_last") Map<String, Double> convertedLast,
            @JsonProperty("converted_volume") Map<String, Double> convertedVolume,
            @JsonProperty("trust_score") String trustScore,
            @JsonProperty("bid_ask_spread_percentage") Double bidAskSpreadPercentage,
            String timestamp,
            @JsonProperty("last_traded_at") String lastTradedAt,
            @JsonProperty("last_fetch_at") String lastFetchAt,
            @JsonProperty("is_anomaly") Boolean isAnomaly,
            @JsonProperty("is_stale") Boolean isStale,
            @JsonProperty("trade_url") String tradeUrl,
            @JsonProperty("token_info_url") String tokenInfoUrl,
            @JsonProperty("coin_id") String coinId,
            @JsonProperty("target_coin_id") String targetCoinId
    ) {
        public record Market(
                String name,
                String identifier,
                @JsonProperty("has_trading_incentive") String hasTradingIncentive
        ) {
        }
    }
}