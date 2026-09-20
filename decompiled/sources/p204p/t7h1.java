package p204p;

import com.spotify.voiceassistants.playermodels.ParsedQueryKt;
import p196j$.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public final class t7h1 extends uve {

    /* JADX INFO: renamed from: a */
    public final String f217772a;

    /* JADX INFO: renamed from: b */
    public final Duration f217773b;

    /* JADX INFO: renamed from: c */
    public final double f217774c;

    /* JADX INFO: renamed from: d */
    public final int f217775d;

    /* JADX INFO: renamed from: e */
    public final tve f217776e;

    public t7h1(String str, Duration duration, double d, int i, tve tveVar) {
        this.f217772a = str;
        this.f217773b = duration;
        this.f217774c = d;
        this.f217775d = i;
        this.f217776e = tveVar;
    }

    @Override // p204p.uve
    /* JADX INFO: renamed from: b */
    public final tve mo80218b() {
        return this.f217776e;
    }

    @Override // p204p.uve
    /* JADX INFO: renamed from: c */
    public final String mo80219c() {
        return this.f217772a;
    }

    @Override // p204p.uve
    /* JADX INFO: renamed from: d */
    public final Duration mo80220d() {
        return this.f217773b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uve)) {
            return false;
        }
        t7h1 t7h1Var = (t7h1) ((uve) obj);
        return this.f217772a.equals(t7h1Var.f217772a) && this.f217773b.equals(t7h1Var.f217773b) && Double.doubleToLongBits(this.f217774c) == Double.doubleToLongBits(t7h1Var.f217774c) && edb.m38554c(this.f217775d, t7h1Var.f217775d) && this.f217776e.equals(t7h1Var.f217776e);
    }

    public final int hashCode() {
        int iHashCode = ((this.f217772a.hashCode() ^ 1000003) * 1000003) ^ this.f217773b.hashCode();
        double d = this.f217774c;
        return (((((iHashCode * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003) ^ edb.m38547C(this.f217775d)) * 1000003) ^ this.f217776e.hashCode();
    }

    public final String toString() {
        String str;
        String string = this.f217773b.toString();
        int i = this.f217775d;
        if (i == 1) {
            str = "BUFFERING";
        } else if (i == 2) {
            str = ParsedQueryKt.INTENT_PLAY;
        } else if (i == 3) {
            str = "PAUSE";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "ENDED";
        }
        String string2 = this.f217776e.toString();
        StringBuilder sb = new StringBuilder("CoWatchingState{mediaId=");
        klh.m56844p(sb, this.f217772a, ", mediaPlayoutPosition=", string, ", mediaPlayoutRate=");
        sb.append(this.f217774c);
        sb.append(", playbackState=");
        sb.append(str);
        return dq60.m36618r(sb, ", coWatchingQueue=", string2, "}");
    }
}
