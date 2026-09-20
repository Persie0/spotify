package com.spotify.featuregate.p068v1;

import p204p.oey;
import p204p.vd50;

/* JADX INFO: renamed from: com.spotify.featuregate.v1.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C0759b implements vd50 {
    @Override // p204p.vd50
    public final Object convert(int i) {
        oey oeyVar;
        switch (i) {
            case 0:
                oeyVar = oey.UNKNOWN;
                break;
            case 1:
                oeyVar = oey.ENTITLEMENT_MISSING;
                break;
            case 2:
                oeyVar = oey.FEATURE_UNAVAILABLE;
                break;
            case 3:
                oeyVar = oey.AGE_RESTRICTED;
                break;
            case 4:
                oeyVar = oey.AGE_ASSURANCE_REQUIRED;
                break;
            case 5:
                oeyVar = oey.CHILD_ACCOUNT;
                break;
            case 6:
                oeyVar = oey.DEVICE_NOT_SUPPORTED;
                break;
            case 7:
                oeyVar = oey.BLOCKED_BY_USER_SETTING;
                break;
            case 8:
                oeyVar = oey.BLOCKED_BY_ACCOUNT_MANAGER;
                break;
            default:
                oeyVar = null;
                break;
        }
        return oeyVar == null ? oey.UNRECOGNIZED : oeyVar;
    }
}
