package p204p;

import com.spotify.concertpageview.p048v1.SourceReference;
import com.spotify.concertpageview.p048v1.TimelineAction;

/* JADX INFO: loaded from: classes8.dex */
public final class tp71 {

    /* JADX INFO: renamed from: a */
    public final TimelineAction f222455a;

    /* JADX INFO: renamed from: b */
    public final SourceReference f222456b;

    public tp71(TimelineAction timelineAction, SourceReference sourceReference) {
        this.f222455a = timelineAction;
        this.f222456b = sourceReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp71)) {
            return false;
        }
        tp71 tp71Var = (tp71) obj;
        return wj50.m88271j(this.f222455a, tp71Var.f222455a) && wj50.m88271j(this.f222456b, tp71Var.f222456b);
    }

    public final int hashCode() {
        int iHashCode = this.f222455a.hashCode() * 31;
        SourceReference sourceReference = this.f222456b;
        return iHashCode + (sourceReference == null ? 0 : sourceReference.hashCode());
    }
}
