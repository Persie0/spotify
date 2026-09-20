package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class mb60 implements f001 {

    /* JADX INFO: renamed from: a */
    public final mqr f141807a;

    /* JADX INFO: renamed from: b */
    public final a660 f141808b;

    public mb60(mqr mqrVar, a660 a660Var) {
        this.f141807a = mqrVar;
        this.f141808b = a660Var;
    }

    @Override // p204p.f001
    /* JADX INFO: renamed from: a */
    public final void mo31587a() {
        if (((cd4) this.f141808b.f12703a.get()).m32420y()) {
            mqr mqrVar = this.f141807a;
            Activity activityM84993a = ((v9x0) mqrVar.f146343b).m84993a();
            if (activityM84993a != null) {
                ske.m78369c((ske) ((jf50) mqrVar.f146344c).invoke(activityM84993a), "jam:jam-ended-survey:v1", null, null, null, null, null, null, null, null, 510).doOnSuccess(frz.f72691S0).onErrorComplete().subscribe();
            }
        }
    }
}
