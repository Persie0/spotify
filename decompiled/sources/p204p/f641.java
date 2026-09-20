package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f641 extends d641 {

    /* JADX INFO: renamed from: a */
    public final long f66258a;

    /* JADX INFO: renamed from: b */
    public final long f66259b;

    /* JADX INFO: renamed from: c */
    public final List f66260c;

    public f641(long j, long j2, List list) {
        this.f66258a = j;
        this.f66259b = j2;
        this.f66260c = Collections.unmodifiableList(list);
    }

    @Override // p204p.d641
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f66258a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return ikc0.m50938j(this.f66259b, " }", sb);
    }
}
