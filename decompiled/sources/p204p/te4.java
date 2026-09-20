package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class te4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f219568a;

    /* JADX INFO: renamed from: b */
    public final bji f219569b;

    /* JADX INFO: renamed from: c */
    public final wg61 f219570c;

    public te4(boolean z, bji bjiVar) {
        this.f219568a = z;
        this.f219569b = bjiVar;
        this.f219570c = new wg61(new ne4(this, 5));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80526a() {
        te4 te4Var = (te4) this.f219570c.getValue();
        return te4Var != null ? te4Var.m80526a() : this.f219568a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a(x09.f256832d, "android-list-ux-platform-consumers-standard-listcomponents-privacysnackbar", m80526a()));
    }

    public te4(bji bjiVar) {
        this(true, bjiVar);
    }
}
