package com.google.android.meet.addons;

import java.util.Objects;
import p204p.pv1;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public class AddonException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final pv1 f2329a;

    /* JADX WARN: Illegal instructions before constructor call */
    public AddonException(String str, pv1 pv1Var) {
        pv1 pv1Var2 = pv1.f181559a;
        if (str == null && pv1Var.equals(pv1Var2)) {
            str = null;
        } else if (!pv1Var.equals(pv1Var2)) {
            str = str == null ? pv1Var.name() : s571.m77252k(str, " [", pv1Var.name(), "]");
        }
        super(str);
        this.f2329a = pv1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AddonException) {
            AddonException addonException = (AddonException) obj;
            if (this.f2329a == addonException.f2329a) {
                if (getMessage() == null && addonException.getMessage() == null) {
                    return true;
                }
                return getMessage() != null && getMessage().equals(addonException.getMessage());
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2329a, getMessage());
    }
}
