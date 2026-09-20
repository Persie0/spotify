package com.google.crypto.tink.shaded.protobuf;

import p204p.hru0;
import p204p.w9h1;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0161j {
    /* JADX INFO: renamed from: a */
    public final boolean m1876a(Object obj, hru0 hru0Var) throws InvalidProtocolBufferException {
        int tag = hru0Var.getTag();
        int iM87510q = w9h1.m87510q(tag);
        int iM87511r = w9h1.m87511r(tag);
        if (iM87511r == 0) {
            ((C0162k) obj).m1879c(w9h1.m87514v(iM87510q, 0), Long.valueOf(hru0Var.mo1698F()));
            return true;
        }
        if (iM87511r == 1) {
            ((C0162k) obj).m1879c(w9h1.m87514v(iM87510q, 1), Long.valueOf(hru0Var.mo1709a()));
            return true;
        }
        if (iM87511r == 2) {
            ((C0162k) obj).m1879c(w9h1.m87514v(iM87510q, 2), hru0Var.mo1722n());
            return true;
        }
        if (iM87511r != 3) {
            if (iM87511r == 4) {
                return false;
            }
            if (iM87511r != 5) {
                throw InvalidProtocolBufferException.m1674b();
            }
            ((C0162k) obj).m1879c(w9h1.m87514v(iM87510q, 5), Integer.valueOf(hru0Var.mo1728t()));
            return true;
        }
        C0162k c0162kM1877b = C0162k.m1877b();
        int iM87514v = w9h1.m87514v(iM87510q, 4);
        while (hru0Var.mo1734z() != Integer.MAX_VALUE && m1876a(c0162kM1877b, hru0Var)) {
        }
        if (iM87514v != hru0Var.getTag()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c0162kM1877b.f2387e = false;
        ((C0162k) obj).m1879c(w9h1.m87514v(iM87510q, 3), c0162kM1877b);
        return true;
    }
}
