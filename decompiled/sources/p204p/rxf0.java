package p204p;

import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;

/* JADX INFO: loaded from: classes9.dex */
public final class rxf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public EsLoggingParams$LoggingParams f203586a;

    /* JADX INFO: renamed from: b */
    public int f203587b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f203588c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wxf0 f203589d;

    /* JADX INFO: renamed from: e */
    public int f203590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxf0(wxf0 wxf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f203589d = wxf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203588c = obj;
        this.f203590e |= Integer.MIN_VALUE;
        return this.f203589d.m89237e(null, 0, this);
    }
}
