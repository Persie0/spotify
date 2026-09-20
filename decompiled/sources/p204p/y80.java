package p204p;

import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class y80 extends a90 {

    /* JADX INFO: renamed from: d */
    public final ArrayList f270155d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f270156e;

    public y80(ArrayList arrayList, ArrayList arrayList2) {
        super(R.string.actions_picker_download, spu.f212955c, 1);
        this.f270155d = arrayList;
        this.f270156e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y80)) {
            return false;
        }
        y80 y80Var = (y80) obj;
        return wj50.m88271j(this.f270155d, y80Var.f270155d) && wj50.m88271j(this.f270156e, y80Var.f270156e);
    }

    public final int hashCode() {
        return this.f270156e.hashCode() + (this.f270155d.hashCode() * 31);
    }
}
