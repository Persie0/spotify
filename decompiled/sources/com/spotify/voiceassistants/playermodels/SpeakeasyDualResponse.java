package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse;", "", "<init>", "()V", "CanPrepareResponse", "FullSuccessResponse", "FailedResponse", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$CanPrepareResponse;", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$FailedResponse;", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$FullSuccessResponse;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class SpeakeasyDualResponse {

    @Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$CanPrepareResponse;", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse;", "actionNlUri", "", "<init>", "(Ljava/lang/String;)V", "getActionNlUri", "()Ljava/lang/String;", "complete", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$FullSuccessResponse;", "commandPlayResponse", "Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "ActionNlResponse", "PartialResponse", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$CanPrepareResponse$ActionNlResponse;", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$CanPrepareResponse$PartialResponse;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static abstract class CanPrepareResponse extends SpeakeasyDualResponse {
        private final String actionNlUri;

        @Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$CanPrepareResponse$ActionNlResponse;", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$CanPrepareResponse;", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "complete", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$FullSuccessResponse;", "commandPlayResponse", "Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final /* data */ class ActionNlResponse extends CanPrepareResponse {
            private final String action;

            public ActionNlResponse(String str) {
                super(str, null);
                this.action = str;
            }

            public static /* synthetic */ ActionNlResponse copy$default(ActionNlResponse actionNlResponse, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionNlResponse.action;
                }
                return actionNlResponse.copy(str);
            }

            @Override // com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse.CanPrepareResponse
            public FullSuccessResponse complete(CommandPlayResponse commandPlayResponse) {
                return new FullSuccessResponse(this.action, null, commandPlayResponse);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            public final ActionNlResponse copy(String action) {
                return new ActionNlResponse(action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ActionNlResponse) && wj50.m88271j(this.action, ((ActionNlResponse) other).action);
            }

            public final String getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        @Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$CanPrepareResponse$PartialResponse;", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$CanPrepareResponse;", "action", "", "searchResponse", "Lcom/spotify/voiceassistants/playermodels/SearchResponse;", "<init>", "(Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/SearchResponse;)V", "getAction", "()Ljava/lang/String;", "getSearchResponse", "()Lcom/spotify/voiceassistants/playermodels/SearchResponse;", "complete", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$FullSuccessResponse;", "commandPlayResponse", "Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final /* data */ class PartialResponse extends CanPrepareResponse {
            private final String action;
            private final SearchResponse searchResponse;

            public PartialResponse(String str, SearchResponse searchResponse) {
                super(str, null);
                this.action = str;
                this.searchResponse = searchResponse;
            }

            public static /* synthetic */ PartialResponse copy$default(PartialResponse partialResponse, String str, SearchResponse searchResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = partialResponse.action;
                }
                if ((i & 2) != 0) {
                    searchResponse = partialResponse.searchResponse;
                }
                return partialResponse.copy(str, searchResponse);
            }

            @Override // com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse.CanPrepareResponse
            public FullSuccessResponse complete(CommandPlayResponse commandPlayResponse) {
                return new FullSuccessResponse(this.action, this.searchResponse, commandPlayResponse);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final SearchResponse getSearchResponse() {
                return this.searchResponse;
            }

            public final PartialResponse copy(String action, SearchResponse searchResponse) {
                return new PartialResponse(action, searchResponse);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PartialResponse)) {
                    return false;
                }
                PartialResponse partialResponse = (PartialResponse) other;
                return wj50.m88271j(this.action, partialResponse.action) && wj50.m88271j(this.searchResponse, partialResponse.searchResponse);
            }

            public final String getAction() {
                return this.action;
            }

            public final SearchResponse getSearchResponse() {
                return this.searchResponse;
            }

            public int hashCode() {
                return this.searchResponse.hashCode() + (this.action.hashCode() * 31);
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ CanPrepareResponse(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public abstract FullSuccessResponse complete(CommandPlayResponse commandPlayResponse);

        public final String getActionNlUri() {
            return this.actionNlUri;
        }

        private CanPrepareResponse(String str) {
            super(null);
            this.actionNlUri = str;
        }
    }

    @Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$FullSuccessResponse;", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse;", "action", "", "searchResponse", "Lcom/spotify/voiceassistants/playermodels/SearchResponse;", "commandPlayResponse", "Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "<init>", "(Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/SearchResponse;Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;)V", "getAction", "()Ljava/lang/String;", "getSearchResponse", "()Lcom/spotify/voiceassistants/playermodels/SearchResponse;", "getCommandPlayResponse", "()Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class FullSuccessResponse extends SpeakeasyDualResponse {
        private final String action;
        private final CommandPlayResponse commandPlayResponse;
        private final SearchResponse searchResponse;

        public FullSuccessResponse(String str, SearchResponse searchResponse, CommandPlayResponse commandPlayResponse) {
            super(null);
            this.action = str;
            this.searchResponse = searchResponse;
            this.commandPlayResponse = commandPlayResponse;
        }

        public static /* synthetic */ FullSuccessResponse copy$default(FullSuccessResponse fullSuccessResponse, String str, SearchResponse searchResponse, CommandPlayResponse commandPlayResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fullSuccessResponse.action;
            }
            if ((i & 2) != 0) {
                searchResponse = fullSuccessResponse.searchResponse;
            }
            if ((i & 4) != 0) {
                commandPlayResponse = fullSuccessResponse.commandPlayResponse;
            }
            return fullSuccessResponse.copy(str, searchResponse, commandPlayResponse);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SearchResponse getSearchResponse() {
            return this.searchResponse;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CommandPlayResponse getCommandPlayResponse() {
            return this.commandPlayResponse;
        }

        public final FullSuccessResponse copy(String action, SearchResponse searchResponse, CommandPlayResponse commandPlayResponse) {
            return new FullSuccessResponse(action, searchResponse, commandPlayResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FullSuccessResponse)) {
                return false;
            }
            FullSuccessResponse fullSuccessResponse = (FullSuccessResponse) other;
            return wj50.m88271j(this.action, fullSuccessResponse.action) && wj50.m88271j(this.searchResponse, fullSuccessResponse.searchResponse) && wj50.m88271j(this.commandPlayResponse, fullSuccessResponse.commandPlayResponse);
        }

        public final String getAction() {
            return this.action;
        }

        public final CommandPlayResponse getCommandPlayResponse() {
            return this.commandPlayResponse;
        }

        public final SearchResponse getSearchResponse() {
            return this.searchResponse;
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            SearchResponse searchResponse = this.searchResponse;
            return this.commandPlayResponse.hashCode() + ((iHashCode + (searchResponse == null ? 0 : searchResponse.hashCode())) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ SpeakeasyDualResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SpeakeasyDualResponse() {
    }

    @Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse$FailedResponse;", "Lcom/spotify/voiceassistants/playermodels/SpeakeasyDualResponse;", "searchResult", "", "searchResponse", "Lcom/spotify/voiceassistants/playermodels/SearchResponse;", "errorMsg", "<init>", "(Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/SearchResponse;Ljava/lang/String;)V", "getSearchResult$annotations", "()V", "getSearchResult", "()Ljava/lang/String;", "getSearchResponse", "()Lcom/spotify/voiceassistants/playermodels/SearchResponse;", "getErrorMsg", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class FailedResponse extends SpeakeasyDualResponse {
        private final String errorMsg;
        private final SearchResponse searchResponse;
        private final String searchResult;

        public FailedResponse(String str, SearchResponse searchResponse, String str2) {
            super(null);
            this.searchResult = str;
            this.searchResponse = searchResponse;
            this.errorMsg = str2;
        }

        public static /* synthetic */ FailedResponse copy$default(FailedResponse failedResponse, String str, SearchResponse searchResponse, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failedResponse.searchResult;
            }
            if ((i & 2) != 0) {
                searchResponse = failedResponse.searchResponse;
            }
            if ((i & 4) != 0) {
                str2 = failedResponse.errorMsg;
            }
            return failedResponse.copy(str, searchResponse, str2);
        }

        public static /* synthetic */ void getSearchResult$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSearchResult() {
            return this.searchResult;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SearchResponse getSearchResponse() {
            return this.searchResponse;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final FailedResponse copy(String searchResult, SearchResponse searchResponse, String errorMsg) {
            return new FailedResponse(searchResult, searchResponse, errorMsg);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedResponse)) {
                return false;
            }
            FailedResponse failedResponse = (FailedResponse) other;
            return wj50.m88271j(this.searchResult, failedResponse.searchResult) && wj50.m88271j(this.searchResponse, failedResponse.searchResponse) && wj50.m88271j(this.errorMsg, failedResponse.errorMsg);
        }

        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final SearchResponse getSearchResponse() {
            return this.searchResponse;
        }

        public final String getSearchResult() {
            return this.searchResult;
        }

        public int hashCode() {
            int iHashCode = (this.searchResponse.hashCode() + (this.searchResult.hashCode() * 31)) * 31;
            String str = this.errorMsg;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ FailedResponse(String str, SearchResponse searchResponse, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, searchResponse, (i & 4) != 0 ? null : str2);
        }
    }
}
