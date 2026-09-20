package com.spotify.contribution.repositoryimpl;

import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "RequestFailed", "InvalidResponseData", "InvalidUri", "MissingPayload", "MissingTarget", "EmptyResponse", "ServerError", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$EmptyResponse;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$InvalidResponseData;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$InvalidUri;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$MissingPayload;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$MissingTarget;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$RequestFailed;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError$ServerError;", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class ContributionApiError extends Exception {

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError$EmptyResponse;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "<init>", "()V", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class EmptyResponse extends ContributionApiError {

        /* JADX INFO: renamed from: a */
        public static final EmptyResponse f3454a = new EmptyResponse();

        private EmptyResponse() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EmptyResponse);
        }

        public final int hashCode() {
            return -881793179;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "EmptyResponse";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError$InvalidResponseData;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class InvalidResponseData extends ContributionApiError {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidResponseData);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError$InvalidUri;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class InvalidUri extends ContributionApiError {

        /* JADX INFO: renamed from: a */
        public final String f3455a;

        /* JADX INFO: renamed from: b */
        public final String f3456b;

        public InvalidUri(String str) {
            super(0);
            this.f3455a = "contribution_uri";
            this.f3456b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidUri)) {
                return false;
            }
            InvalidUri invalidUri = (InvalidUri) obj;
            return wj50.m88271j(this.f3455a, invalidUri.f3455a) && wj50.m88271j(this.f3456b, invalidUri.f3456b);
        }

        public final int hashCode() {
            return this.f3456b.hashCode() + (this.f3455a.hashCode() * 31);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError$MissingPayload;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "<init>", "()V", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class MissingPayload extends ContributionApiError {

        /* JADX INFO: renamed from: a */
        public static final MissingPayload f3457a = new MissingPayload();

        private MissingPayload() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingPayload);
        }

        public final int hashCode() {
            return -404813455;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "MissingPayload";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError$MissingTarget;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "<init>", "()V", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class MissingTarget extends ContributionApiError {

        /* JADX INFO: renamed from: a */
        public static final MissingTarget f3458a = new MissingTarget();

        private MissingTarget() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingTarget);
        }

        public final int hashCode() {
            return 932528462;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "MissingTarget";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError$RequestFailed;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class RequestFailed extends ContributionApiError {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestFailed);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/contribution/repositoryimpl/ContributionApiError$ServerError;", "Lcom/spotify/contribution/repositoryimpl/ContributionApiError;", "src_main_java_com_spotify_contribution_repositoryimpl-repositoryimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class ServerError extends ContributionApiError {

        /* JADX INFO: renamed from: a */
        public final int f3459a;

        /* JADX INFO: renamed from: b */
        public final String f3460b;

        public ServerError(int i, String str) {
            super(0);
            this.f3459a = i;
            this.f3460b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServerError)) {
                return false;
            }
            ServerError serverError = (ServerError) obj;
            return this.f3459a == serverError.f3459a && wj50.m88271j(this.f3460b, serverError.f3460b);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f3460b;
        }

        public final int hashCode() {
            return this.f3460b.hashCode() + (Integer.hashCode(this.f3459a) * 31);
        }
    }

    public /* synthetic */ ContributionApiError(int i) {
        this();
    }

    private ContributionApiError() {
    }
}
