package com.spotify.login.credentialmanager.passkeys;

import kotlin.Metadata;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "InvalidRequest", "Unauthenticated", "Forbidden", "CredentialNotFound", "SessionGone", "ServiceUnavailable", "UnexpectedHttpError", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$CredentialNotFound;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$Forbidden;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$InvalidRequest;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$ServiceUnavailable;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$SessionGone;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$Unauthenticated;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$UnexpectedHttpError;", "src_main_java_com_spotify_login_credentialmanager-credentialmanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class PasskeysApiException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f5308a;

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$CredentialNotFound;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException;", "src_main_java_com_spotify_login_credentialmanager-credentialmanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class CredentialNotFound extends PasskeysApiException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$Forbidden;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException;", "src_main_java_com_spotify_login_credentialmanager-credentialmanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Forbidden extends PasskeysApiException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$InvalidRequest;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException;", "src_main_java_com_spotify_login_credentialmanager-credentialmanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class InvalidRequest extends PasskeysApiException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$ServiceUnavailable;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException;", "src_main_java_com_spotify_login_credentialmanager-credentialmanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class ServiceUnavailable extends PasskeysApiException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$SessionGone;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException;", "src_main_java_com_spotify_login_credentialmanager-credentialmanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class SessionGone extends PasskeysApiException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$Unauthenticated;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException;", "src_main_java_com_spotify_login_credentialmanager-credentialmanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Unauthenticated extends PasskeysApiException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException$UnexpectedHttpError;", "Lcom/spotify/login/credentialmanager/passkeys/PasskeysApiException;", "src_main_java_com_spotify_login_credentialmanager-credentialmanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class UnexpectedHttpError extends PasskeysApiException {
    }

    public PasskeysApiException(int i, HttpException httpException) {
        super(httpException);
        this.f5308a = i;
    }
}
