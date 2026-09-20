package com.spotify.mobius;

import p204p.bsa0;
import p204p.fpr;
import p204p.s571;
import p204p.xra0;

/* JADX INFO: loaded from: classes2.dex */
abstract class ControllerStateBase<M, E> {

    /* JADX INFO: renamed from: a */
    public static final xra0 f5534a = bsa0.m30425b(ControllerStateBase.class);

    /* JADX INFO: renamed from: a */
    public abstract String mo15562a();

    /* JADX INFO: renamed from: b */
    public void mo15563b(Connectable connectable) {
        throw new IllegalStateException(s571.m77251j("cannot call connect when in the ", mo15562a(), " state"));
    }

    /* JADX INFO: renamed from: c */
    public void mo15564c() {
        throw new IllegalStateException(s571.m77251j("cannot call disconnect when in the ", mo15562a(), " state"));
    }

    /* JADX INFO: renamed from: d */
    public void mo15565d(Object obj) {
        f5534a.mo27133d("Dropping event that was dispatched when the program was in the {} state: {}", mo15562a(), obj);
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo15566e();

    /* JADX INFO: renamed from: f */
    public void mo15567f(fpr fprVar) {
        throw new IllegalStateException(s571.m77251j("cannot call replaceModel when in the ", mo15562a(), " state"));
    }

    /* JADX INFO: renamed from: g */
    public void mo15568g() {
        throw new IllegalStateException(s571.m77251j("cannot call start when in the ", mo15562a(), " state"));
    }

    /* JADX INFO: renamed from: h */
    public void mo15569h() {
        throw new IllegalStateException(s571.m77251j("cannot call stop when in the ", mo15562a(), " state"));
    }

    /* JADX INFO: renamed from: i */
    public void mo15570i(Object obj) {
        f5534a.mo27133d("Dropping model that was dispatched when the program was in the {} state: {}", mo15562a(), obj);
    }
}
