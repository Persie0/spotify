package p204p;

import android.app.Notification;

/* JADX INFO: loaded from: classes7.dex */
public final class z200 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Integer f278455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i6o f278456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f278457c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Notification f278458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z200(int i, Notification notification, Integer num, i6o i6oVar) {
        super(0);
        this.f278455a = num;
        this.f278456b = i6oVar;
        this.f278457c = i;
        this.f278458d = notification;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Notification notification = this.f278458d;
        int i = this.f278457c;
        i6o i6oVar = this.f278456b;
        Integer num = this.f278455a;
        if (num != null) {
            i6oVar.startForeground(i, notification, num.intValue());
        } else {
            i6oVar.startForeground(i, notification);
        }
        return w2a1.f247311a;
    }
}
