package com.spotify.appauthorization.builtinauth.authenticator;

import p204p.klh;
import p204p.pi9;

/* JADX INFO: loaded from: classes3.dex */
public class BuiltInAuthException extends RuntimeException {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f2949c = 0;

    /* JADX INFO: renamed from: a */
    public final int f2950a;

    /* JADX INFO: renamed from: b */
    public final String f2951b;

    public BuiltInAuthException(int i, String str) {
        this.f2950a = i;
        this.f2951b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        int i = this.f2950a;
        if (i == 1) {
            str = "ERROR_USER_NEEDS_AUTHORIZATION";
        } else if (i == 2) {
            str = "ERROR_NOT_LOGGED_IN";
        } else if (i == 3) {
            str = "ERROR_OFFLINE_MODE_ACTIVE";
        } else if (i == 4) {
            str = "ERROR_AUTHORIZATION_TIMEOUT";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "ERROR_AUTHORIZATION_RESPONSE";
        }
        return klh.m56834f(str, ": ", this.f2951b);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "BuiltInAuthException{" + pi9.m70096u(this.f2950a) + ":" + this.f2951b + "}";
    }
}
