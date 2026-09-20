package com.facebook;

import java.security.SecureRandom;
import kotlin.Metadata;
import p204p.dvf;
import p204p.fgy;
import p204p.hgy;
import p204p.p8y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "facebook-core_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public class FacebookException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public static final SecureRandom f1660a = new SecureRandom();

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException(String str) {
        super(str);
        if (str == null || !p8y.f175096q.get() || f1660a.nextInt(100) <= 50) {
            return;
        }
        hgy.m47480a(new dvf(str, 3), fgy.ErrorReport);
    }
}
