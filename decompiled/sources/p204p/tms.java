package p204p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public final class tms extends ibk {

    /* JADX INFO: renamed from: a */
    public int f221772a;

    /* JADX INFO: renamed from: b */
    public WidgetState f221773b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f221774c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ums f221775d;

    /* JADX INFO: renamed from: e */
    public int f221776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tms(ums umsVar, ibk ibkVar) {
        super(ibkVar);
        this.f221775d = umsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221774c = obj;
        this.f221776e |= Integer.MIN_VALUE;
        return this.f221775d.m83490a(0, null, this);
    }
}
