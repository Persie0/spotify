package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class enb {

    /* JADX INFO: renamed from: a */
    public final agw f61119a;

    /* JADX INFO: renamed from: b */
    public final boolean f61120b;

    /* JADX INFO: renamed from: c */
    public final Intent f61121c;

    public enb(agw agwVar, boolean z, Intent intent) {
        this.f61119a = agwVar;
        this.f61120b = z;
        this.f61121c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enb)) {
            return false;
        }
        enb enbVar = (enb) obj;
        return wj50.m88271j(this.f61119a, enbVar.f61119a) && this.f61120b == enbVar.f61120b && wj50.m88271j(this.f61121c, enbVar.f61121c);
    }

    public final int hashCode() {
        agw agwVar = this.f61119a;
        int iM77245d = s571.m77245d((agwVar == null ? 0 : agwVar.hashCode()) * 31, 31, this.f61120b);
        Intent intent = this.f61121c;
        return iM77245d + (intent != null ? intent.hashCode() : 0);
    }
}
