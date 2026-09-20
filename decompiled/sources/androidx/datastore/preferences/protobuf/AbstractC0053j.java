package androidx.datastore.preferences.protobuf;

import p204p.dul;
import p204p.jru0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0053j {
    /* JADX INFO: renamed from: a */
    public final boolean m588a(Object obj, jru0 jru0Var) throws InvalidProtocolBufferException {
        int tag = jru0Var.getTag();
        int iM37011n = dul.m37011n(tag);
        int iM37012o = dul.m37012o(tag);
        if (iM37012o == 0) {
            ((C0054k) obj).m591c(dul.m37017t(iM37011n, 0), Long.valueOf(jru0Var.mo478F()));
            return true;
        }
        if (iM37012o == 1) {
            ((C0054k) obj).m591c(dul.m37017t(iM37011n, 1), Long.valueOf(jru0Var.mo492a()));
            return true;
        }
        if (iM37012o == 2) {
            ((C0054k) obj).m591c(dul.m37017t(iM37011n, 2), jru0Var.mo505n());
            return true;
        }
        if (iM37012o != 3) {
            if (iM37012o == 4) {
                return false;
            }
            if (iM37012o != 5) {
                throw InvalidProtocolBufferException.m420b();
            }
            ((C0054k) obj).m591c(dul.m37017t(iM37011n, 5), Integer.valueOf(jru0Var.mo511t()));
            return true;
        }
        C0054k c0054kM589b = C0054k.m589b();
        int iM37017t = dul.m37017t(iM37011n, 4);
        while (jru0Var.mo517z() != Integer.MAX_VALUE && m588a(c0054kM589b, jru0Var)) {
        }
        if (iM37017t != jru0Var.getTag()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c0054kM589b.f878e = false;
        ((C0054k) obj).m591c(dul.m37017t(iM37011n, 3), c0054kM589b);
        return true;
    }
}
