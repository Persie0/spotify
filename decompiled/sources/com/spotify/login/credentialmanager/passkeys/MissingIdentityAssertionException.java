package com.spotify.login.credentialmanager.passkeys;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/login/credentialmanager/passkeys/MissingIdentityAssertionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "src_main_java_com_spotify_login_credentialmanager-credentialmanager"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MissingIdentityAssertionException extends Exception {
    public MissingIdentityAssertionException() {
        super("Passkeys Authenticate/Finish did not return an identity assertion");
    }
}
