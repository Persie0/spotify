package com.spotify.connectivity.auth;

import com.spotify.authentication.credentials.SerializableCredentials;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\t\u0010\u0003J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\nH\u0096 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001cH\u0096 ¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0003¨\u0006#"}, m24212d2 = {"Lcom/spotify/connectivity/auth/NativeCredentialsStorage;", "Lcom/spotify/connectivity/auth/CredentialsStorage;", "<init>", "()V", "Lp/w2a1;", "destroy", "Lcom/spotify/connectivity/auth/CredentialsStorage$StoredCredentialsAndUsername;", "getStoredCredentials", "()Lcom/spotify/connectivity/auth/CredentialsStorage$StoredCredentialsAndUsername;", "deleteStoredCredentials", "", "canonicalUsername", "Lcom/spotify/authentication/credentials/SerializableCredentials;", "getStoredCredentialsForUser", "(Ljava/lang/String;)Lcom/spotify/authentication/credentials/SerializableCredentials;", "credentials", "", "wantSave", "saveLoginDetails", "(Lcom/spotify/authentication/credentials/SerializableCredentials;Ljava/lang/String;Z)V", "username", "rememberMe", "setRememberMeMode", "(Ljava/lang/String;Z)V", "getRememberMeMode", "()Z", "forgetRememberMe", "(Ljava/lang/String;)V", "", "getSavedUsernames", "()Ljava/util/List;", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeCredentialsStorage implements CredentialsStorage {
    private long nThis;

    private NativeCredentialsStorage() {
    }

    private static /* synthetic */ void getNThis$annotations() {
    }

    @Override // com.spotify.connectivity.auth.CredentialsStorage
    public native void deleteStoredCredentials();

    public final native void destroy();

    @Override // com.spotify.connectivity.auth.CredentialsStorage
    public native void forgetRememberMe(String username);

    @Override // com.spotify.connectivity.auth.CredentialsStorage
    public native boolean getRememberMeMode();

    @Override // com.spotify.connectivity.auth.CredentialsStorage
    public native List<String> getSavedUsernames();

    @Override // com.spotify.connectivity.auth.CredentialsStorage
    public native CredentialsStorage.StoredCredentialsAndUsername getStoredCredentials();

    @Override // com.spotify.connectivity.auth.CredentialsStorage
    public native SerializableCredentials getStoredCredentialsForUser(String canonicalUsername);

    @Override // com.spotify.connectivity.auth.CredentialsStorage
    public native void saveLoginDetails(SerializableCredentials credentials, String canonicalUsername, boolean wantSave);

    @Override // com.spotify.connectivity.auth.CredentialsStorage
    public native void setRememberMeMode(String username, boolean rememberMe);
}
