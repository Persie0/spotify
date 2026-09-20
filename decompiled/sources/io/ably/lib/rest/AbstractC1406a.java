package io.ably.lib.rest;

import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import java.util.HashSet;
import p204p.C1761d0;
import p204p.C1880g0;
import p204p.C2595y;
import p204p.C2632z;
import p204p.jm6;
import p204p.km6;
import p204p.og30;
import p204p.tx8;
import p204p.yg30;
import p204p.z7m;

/* JADX INFO: renamed from: io.ably.lib.rest.a */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC1406a implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final ClientOptions f7157a;

    /* JADX INFO: renamed from: b */
    public final og30 f7158b;

    /* JADX INFO: renamed from: c */
    public final yg30 f7159c;

    /* JADX INFO: renamed from: d */
    public final Auth f7160d;

    /* JADX INFO: renamed from: e */
    public final C2632z f7161e;

    /* JADX INFO: renamed from: f */
    public final C1880g0 f7162f;

    /* JADX INFO: renamed from: g */
    public final C2595y f7163g;

    /* JADX INFO: renamed from: h */
    public final C1761d0 f7164h;

    public AbstractC1406a(ClientOptions clientOptions, C1761d0 c1761d0) {
        this.f7157a = clientOptions;
        int i = clientOptions.logLevel;
        tx8.f224599d = i == 0 ? 5 : i;
        tx8.m81894i(getClass().getName(), "started");
        this.f7164h = c1761d0;
        Auth auth = new Auth(this, clientOptions);
        this.f7160d = auth;
        yg30 yg30Var = new yg30(clientOptions, auth, c1761d0);
        this.f7159c = yg30Var;
        this.f7158b = new og30(new km6(yg30Var, new jm6(clientOptions)), new km6(yg30Var, z7m.f280254a));
        this.f7161e = new C2632z(this);
        C1880g0 c1880g0 = new C1880g0();
        C1880g0 c1880g1 = new C1880g0();
        c1880g1.f75226a = new HashSet();
        c1880g0.f75226a = c1880g1;
        this.f7162f = c1880g0;
        this.f7163g = new C2595y();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo23276a(ErrorInfo errorInfo);

    /* JADX INFO: renamed from: c */
    public abstract void mo23277c(String str, boolean z);

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.f7158b.close();
    }
}
