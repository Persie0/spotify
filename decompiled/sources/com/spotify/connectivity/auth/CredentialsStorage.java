package com.spotify.connectivity.auth;

import com.spotify.authentication.credentials.SerializableCredentials;
import java.util.List;
import kotlin.Metadata;
import p204p.edb;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u001dJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000eH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/connectivity/auth/CredentialsStorage;", "", "Lcom/spotify/connectivity/auth/CredentialsStorage$StoredCredentialsAndUsername;", "getStoredCredentials", "()Lcom/spotify/connectivity/auth/CredentialsStorage$StoredCredentialsAndUsername;", "Lp/w2a1;", "deleteStoredCredentials", "()V", "", "canonicalUsername", "Lcom/spotify/authentication/credentials/SerializableCredentials;", "getStoredCredentialsForUser", "(Ljava/lang/String;)Lcom/spotify/authentication/credentials/SerializableCredentials;", "credentials", "", "wantSave", "saveLoginDetails", "(Lcom/spotify/authentication/credentials/SerializableCredentials;Ljava/lang/String;Z)V", "username", "rememberMe", "setRememberMeMode", "(Ljava/lang/String;Z)V", "getRememberMeMode", "()Z", "forgetRememberMe", "(Ljava/lang/String;)V", "", "getSavedUsernames", "()Ljava/util/List;", "StoredCredentialsAndUsername", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface CredentialsStorage {

    @Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m24212d2 = {"Lcom/spotify/connectivity/auth/CredentialsStorage$StoredCredentialsAndUsername;", "", "credentials", "Lcom/spotify/authentication/credentials/SerializableCredentials;", "canonicalUsername", "", "rememberMe", "", "<init>", "(Lcom/spotify/authentication/credentials/SerializableCredentials;Ljava/lang/String;Z)V", "getCredentials", "()Lcom/spotify/authentication/credentials/SerializableCredentials;", "setCredentials", "(Lcom/spotify/authentication/credentials/SerializableCredentials;)V", "getCanonicalUsername", "()Ljava/lang/String;", "setCanonicalUsername", "(Ljava/lang/String;)V", "getRememberMe", "()Z", "setRememberMe", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class StoredCredentialsAndUsername {
        private String canonicalUsername;
        private SerializableCredentials credentials;
        private boolean rememberMe;

        public StoredCredentialsAndUsername(SerializableCredentials serializableCredentials, String str, boolean z) {
            this.credentials = serializableCredentials;
            this.canonicalUsername = str;
            this.rememberMe = z;
        }

        public static /* synthetic */ StoredCredentialsAndUsername copy$default(StoredCredentialsAndUsername storedCredentialsAndUsername, SerializableCredentials serializableCredentials, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                serializableCredentials = storedCredentialsAndUsername.credentials;
            }
            if ((i & 2) != 0) {
                str = storedCredentialsAndUsername.canonicalUsername;
            }
            if ((i & 4) != 0) {
                z = storedCredentialsAndUsername.rememberMe;
            }
            return storedCredentialsAndUsername.copy(serializableCredentials, str, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SerializableCredentials getCredentials() {
            return this.credentials;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCanonicalUsername() {
            return this.canonicalUsername;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getRememberMe() {
            return this.rememberMe;
        }

        public final StoredCredentialsAndUsername copy(SerializableCredentials credentials, String canonicalUsername, boolean rememberMe) {
            return new StoredCredentialsAndUsername(credentials, canonicalUsername, rememberMe);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoredCredentialsAndUsername)) {
                return false;
            }
            StoredCredentialsAndUsername storedCredentialsAndUsername = (StoredCredentialsAndUsername) other;
            return wj50.m88271j(this.credentials, storedCredentialsAndUsername.credentials) && wj50.m88271j(this.canonicalUsername, storedCredentialsAndUsername.canonicalUsername) && this.rememberMe == storedCredentialsAndUsername.rememberMe;
        }

        public final String getCanonicalUsername() {
            return this.canonicalUsername;
        }

        public final SerializableCredentials getCredentials() {
            return this.credentials;
        }

        public final boolean getRememberMe() {
            return this.rememberMe;
        }

        public int hashCode() {
            return Boolean.hashCode(this.rememberMe) + s571.m77243b(this.credentials.hashCode() * 31, 31, this.canonicalUsername);
        }

        public final void setCanonicalUsername(String str) {
            this.canonicalUsername = str;
        }

        public final void setCredentials(SerializableCredentials serializableCredentials) {
            this.credentials = serializableCredentials;
        }

        public final void setRememberMe(boolean z) {
            this.rememberMe = z;
        }

        public String toString() {
            SerializableCredentials serializableCredentials = this.credentials;
            String str = this.canonicalUsername;
            boolean z = this.rememberMe;
            StringBuilder sb = new StringBuilder("StoredCredentialsAndUsername(credentials=");
            sb.append(serializableCredentials);
            sb.append(", canonicalUsername=");
            sb.append(str);
            sb.append(", rememberMe=");
            return edb.m38570s(sb, z, ")");
        }
    }

    void deleteStoredCredentials();

    void forgetRememberMe(String username);

    boolean getRememberMeMode();

    List<String> getSavedUsernames();

    StoredCredentialsAndUsername getStoredCredentials();

    SerializableCredentials getStoredCredentialsForUser(String canonicalUsername);

    void saveLoginDetails(SerializableCredentials credentials, String canonicalUsername, boolean wantSave);

    void setRememberMeMode(String username, boolean rememberMe);
}
