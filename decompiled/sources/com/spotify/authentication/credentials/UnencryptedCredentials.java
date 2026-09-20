package com.spotify.authentication.credentials;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.dq60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/authentication/credentials/UnencryptedCredentials;", "", "username", "", "authBlob", "", "<init>", "(Ljava/lang/String;[B)V", "getUsername", "()Ljava/lang/String;", "getAuthBlob", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_authentication_credentials-credentials"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class UnencryptedCredentials {
    private final byte[] authBlob;
    private final String username;

    /* JADX WARN: Multi-variable type inference failed */
    public UnencryptedCredentials() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UnencryptedCredentials copy$default(UnencryptedCredentials unencryptedCredentials, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unencryptedCredentials.username;
        }
        if ((i & 2) != 0) {
            bArr = unencryptedCredentials.authBlob;
        }
        return unencryptedCredentials.copy(str, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getAuthBlob() {
        return this.authBlob;
    }

    public final UnencryptedCredentials copy(String username, byte[] authBlob) {
        return new UnencryptedCredentials(username, authBlob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnencryptedCredentials)) {
            return false;
        }
        UnencryptedCredentials unencryptedCredentials = (UnencryptedCredentials) other;
        return wj50.m88271j(this.username, unencryptedCredentials.username) && wj50.m88271j(this.authBlob, unencryptedCredentials.authBlob);
    }

    public final byte[] getAuthBlob() {
        return this.authBlob;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        byte[] bArr = this.authBlob;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        return dq60.m36615o("UnencryptedCredentials(username=", this.username, ", authBlob=", Arrays.toString(this.authBlob), ")");
    }

    public UnencryptedCredentials(String str, byte[] bArr) {
        this.username = str;
        this.authBlob = bArr;
    }

    public /* synthetic */ UnencryptedCredentials(String str, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bArr);
    }
}
