package com.google.android.recaptcha;

import kotlin.Metadata;
import p204p.o7t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/google/android/recaptcha/RecaptchaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class RecaptchaException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f2332a;

    public RecaptchaException(int i) {
        super(o7t0.m66391e(i));
        this.f2332a = i;
    }
}
