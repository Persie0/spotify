package com.spotify.searchview.proto;

import p204p.ew00;
import p204p.vd50;

/* JADX INFO: renamed from: com.spotify.searchview.proto.d */
/* JADX INFO: loaded from: classes10.dex */
public final class C1290d implements vd50 {
    @Override // p204p.vd50
    public final Object convert(int i) {
        ew00 ew00Var;
        if (i != 0) {
            ew00Var = i != 1 ? null : ew00.DENY_REASON_ENTITLEMENT_MISSING;
        } else {
            ew00Var = ew00.DENY_REASON_UNSPECIFIED;
        }
        return ew00Var == null ? ew00.UNRECOGNIZED : ew00Var;
    }
}
