package com.google.protobuf;

import p204p.exb;
import p204p.iru0;

/* JADX INFO: renamed from: com.google.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0274m {
    /* JADX INFO: renamed from: a */
    public abstract C0275n mo2188a(Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m2189b(int i, Object obj, iru0 iru0Var) throws InvalidProtocolBufferException {
        int tag = iru0Var.getTag();
        int iM40217o = exb.m40217o(tag);
        int iM40218p = exb.m40218p(tag);
        if (iM40218p == 0) {
            ((C0275n) obj).m2196f(exb.m40221s(iM40217o, 0), Long.valueOf(iru0Var.mo2068F()));
            return true;
        }
        if (iM40218p == 1) {
            ((C0275n) obj).m2196f(exb.m40221s(iM40217o, 1), Long.valueOf(iru0Var.mo2084a()));
            return true;
        }
        if (iM40218p == 2) {
            ((C0275n) obj).m2196f(exb.m40221s(iM40217o, 2), iru0Var.mo2097n());
            return true;
        }
        if (iM40218p != 3) {
            if (iM40218p == 4) {
                if (i != 0) {
                    return false;
                }
                throw InvalidProtocolBufferException.m1949a();
            }
            if (iM40218p != 5) {
                throw InvalidProtocolBufferException.m1952d();
            }
            ((C0275n) obj).m2196f(exb.m40221s(iM40217o, 5), Integer.valueOf(iru0Var.mo2103t()));
            return true;
        }
        C0275n c0275n = new C0275n();
        int iM40221s = exb.m40221s(iM40217o, 4);
        int i2 = i + 1;
        if (i2 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (iru0Var.mo2109z() != Integer.MAX_VALUE && m2189b(i2, c0275n, iru0Var)) {
        }
        if (iM40221s != iru0Var.getTag()) {
            throw InvalidProtocolBufferException.m1949a();
        }
        if (c0275n.f2486e) {
            c0275n.f2486e = false;
        }
        ((C0275n) obj).m2196f(exb.m40221s(iM40217o, 3), c0275n);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo2190c(Object obj, Object obj2);
}
