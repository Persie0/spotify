package com.google.crypto.tink.shaded.protobuf;

import p204p.AbstractC2205o8;
import p204p.b3a1;
import p204p.ei6;
import p204p.fva;
import p204p.gj5;
import p204p.gux;
import p204p.hru0;
import p204p.ikc0;
import p204p.kgy0;
import p204p.m110;
import p204p.ztx;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C0159h implements kgy0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2205o8 f2375a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0161j f2376b;

    /* JADX INFO: renamed from: c */
    public final gux f2377c;

    public C0159h(AbstractC0161j abstractC0161j, gux guxVar, AbstractC2205o8 abstractC2205o8) {
        this.f2376b = abstractC0161j;
        guxVar.getClass();
        this.f2377c = guxVar;
        this.f2375a = abstractC2205o8;
    }

    /* JADX INFO: renamed from: k */
    public static C0159h m1851k(AbstractC0161j abstractC0161j, gux guxVar, AbstractC2205o8 abstractC2205o8) {
        return new C0159h(abstractC0161j, guxVar, abstractC2205o8);
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: a */
    public final void mo1829a(Object obj) {
        ((b3a1) this.f2376b).getClass();
        ((AbstractC0156e) obj).unknownFields.f2387e = false;
        this.f2377c.getClass();
        ikc0.m50942n(obj);
        throw null;
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: b */
    public final boolean mo1830b(Object obj) {
        this.f2377c.getClass();
        ikc0.m50942n(obj);
        throw null;
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: c */
    public final Object mo1831c() {
        return ((m110) ((AbstractC0156e) this.f2375a).mo1803f(5)).m60483c();
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: d */
    public final void mo1832d(Object obj, C0155d c0155d) {
        this.f2377c.getClass();
        ikc0.m50942n(obj);
        throw null;
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: e */
    public final boolean mo1833e(AbstractC0156e abstractC0156e, AbstractC0156e abstractC0156e2) {
        b3a1 b3a1Var = (b3a1) this.f2376b;
        b3a1Var.getClass();
        C0162k c0162k = abstractC0156e.unknownFields;
        b3a1Var.getClass();
        return c0162k.equals(abstractC0156e2.unknownFields);
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: f */
    public final int mo1834f(AbstractC0156e abstractC0156e) {
        ((b3a1) this.f2376b).getClass();
        return abstractC0156e.unknownFields.hashCode();
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: g */
    public final int mo1835g(AbstractC2205o8 abstractC2205o8) {
        ((b3a1) this.f2376b).getClass();
        C0162k c0162k = ((AbstractC0156e) abstractC2205o8).unknownFields;
        int i = c0162k.f2386d;
        if (i != -1) {
            return i;
        }
        int iM1735f0 = 0;
        for (int i2 = 0; i2 < c0162k.f2383a; i2++) {
            int i3 = c0162k.f2384b[i2] >>> 3;
            iM1735f0 += C0154c.m1735f0(3, (fva) c0162k.f2385c[i2]) + C0154c.m1743n0(i3) + C0154c.m1742m0(2) + (C0154c.m1742m0(1) * 2);
        }
        c0162k.f2386d = iM1735f0;
        return iM1735f0;
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: h */
    public final void mo1836h(AbstractC0156e abstractC0156e, AbstractC0156e abstractC0156e2) {
        AbstractC0160i.m1874w(this.f2376b, abstractC0156e, abstractC0156e2);
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: i */
    public final void mo1837i(Object obj, byte[] bArr, int i, int i2, gj5 gj5Var) {
        AbstractC0156e abstractC0156e = (AbstractC0156e) obj;
        if (abstractC0156e.unknownFields == C0162k.f2382f) {
            abstractC0156e.unknownFields = C0162k.m1877b();
        }
        throw ei6.m39072i(obj);
    }

    @Override // p204p.kgy0
    /* JADX INFO: renamed from: j */
    public final void mo1838j(Object obj, hru0 hru0Var, ztx ztxVar) {
        ((b3a1) this.f2376b).getClass();
        AbstractC0156e abstractC0156e = (AbstractC0156e) obj;
        if (abstractC0156e.unknownFields == C0162k.f2382f) {
            abstractC0156e.unknownFields = C0162k.m1877b();
        }
        this.f2377c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
