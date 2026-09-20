package com.ravelin.core.util.security;

import kotlin.Metadata;
import p204p.cve;
import p204p.gk71;
import p204p.utu0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m24212d2 = {"Lcom/ravelin/core/util/security/RootCheckerNative;", "Lp/cve;", "", "", "pathArray", "", "checkForRoot", "([Ljava/lang/Object;)Z", "logDebugMessages", "Lp/w2a1;", "setLogDebugMessages", "(Z)V", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class RootCheckerNative implements cve {

    /* JADX INFO: renamed from: b */
    public static final String f2674b;

    /* JADX INFO: renamed from: a */
    public final boolean f2675a;

    static {
        String canonicalName = RootCheckerNative.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "RootCheckerNative";
        }
        f2674b = canonicalName;
    }

    public RootCheckerNative() {
        System.loadLibrary("rootChecker");
        try {
            System.loadLibrary("rootChecker");
            this.f2675a = true;
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            utu0 utu0Var = gk71.f80747a;
            utu0Var.m83940H(f2674b);
            utu0Var.m83952u(message, new Object[0]);
        }
    }

    private final native boolean checkForRoot(Object[] pathArray);

    private final native void setLogDebugMessages(boolean logDebugMessages);

    /* JADX INFO: renamed from: a */
    public final void m2236a() {
        setLogDebugMessages(false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2237b(Object[] objArr) {
        return checkForRoot(objArr);
    }
}
