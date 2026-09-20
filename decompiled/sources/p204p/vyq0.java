package p204p;

import io.ably.lib.types.PresenceMessage;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes16.dex */
public class vyq0 {

    /* JADX INFO: renamed from: a */
    public boolean f246305a;

    /* JADX INFO: renamed from: b */
    public HashSet f246306b;

    /* JADX INFO: renamed from: c */
    public final HashMap f246307c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xyq0 f246308d;

    public vyq0(xyq0 xyq0Var) {
        this.f246308d = xyq0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m86835a(String str, PresenceMessage presenceMessage) {
        try {
            PresenceMessage presenceMessage2 = (PresenceMessage) this.f246307c.get(str);
            boolean z = false;
            if (presenceMessage2 == null) {
                return false;
            }
            String str2 = presenceMessage.connectionId;
            if (str2 == null || presenceMessage2.connectionId == null || (presenceMessage.f7166id.startsWith(str2) && presenceMessage2.f7166id.startsWith(presenceMessage2.connectionId))) {
                String[] strArrSplit = presenceMessage.f7166id.split(":", 3);
                String[] strArrSplit2 = presenceMessage2.f7166id.split(":", 3);
                if (strArrSplit.length < 3 || strArrSplit2.length < 3) {
                    return false;
                }
                try {
                    long j = Long.parseLong(strArrSplit[1]);
                    long j2 = Long.parseLong(strArrSplit[2]);
                    long j3 = Long.parseLong(strArrSplit2[1]);
                    long j4 = Long.parseLong(strArrSplit2[2]);
                    if (j3 > j || (j3 == j && j4 >= j2)) {
                        z = true;
                    }
                    return z;
                } catch (NumberFormatException unused) {
                    return false;
                }
            }
            return presenceMessage2.timestamp >= presenceMessage.timestamp;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public String mo82000b(PresenceMessage presenceMessage) {
        return presenceMessage.memberKey();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m86836c(PresenceMessage presenceMessage) {
        try {
            String strMo82000b = mo82000b(presenceMessage);
            HashSet hashSet = this.f246306b;
            if (hashSet != null) {
                hashSet.remove(strMo82000b);
            }
            if (m86835a(strMo82000b, presenceMessage)) {
                return false;
            }
            this.f246307c.put(strMo82000b, presenceMessage);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m86837d(PresenceMessage presenceMessage) {
        String strMo82000b = mo82000b(presenceMessage);
        if (m86835a(strMo82000b, presenceMessage)) {
            return false;
        }
        PresenceMessage presenceMessage2 = (PresenceMessage) this.f246307c.remove(strMo82000b);
        return presenceMessage2 == null || presenceMessage2.action != PresenceMessage.Action.absent;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m86838e() {
        tx8.m81897l(xyq0.f267398h, "startSync(); channel = " + this.f246308d.f267404f.f28784c + "; syncInProgress = " + this.f246305a);
        if (!this.f246305a) {
            this.f246306b = new HashSet(this.f246307c.keySet());
            this.f246305a = true;
        }
    }
}
