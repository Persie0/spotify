package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hn6 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jn6 f93223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f93224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn6(jn6 jn6Var, List list, int i) {
        super(0);
        this.f93222a = i;
        this.f93223b = jn6Var;
        this.f93224c = list;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f93222a) {
            case 0:
                this.f93223b.f114023b.addAll(this.f93224c);
                break;
            default:
                this.f93223b.f114022a.mo53807a(this.f93224c);
                break;
        }
        return w2a1.f247311a;
    }
}
