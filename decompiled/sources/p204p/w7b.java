package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w7b extends ibk {

    /* JADX INFO: renamed from: a */
    public y7b f248620a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f248621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u7b f248622c;

    /* JADX INFO: renamed from: d */
    public int f248623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7b(u7b u7bVar, fbk fbkVar) {
        super(fbkVar);
        this.f248622c = u7bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248621b = obj;
        this.f248623d |= Integer.MIN_VALUE;
        return this.f248622c.m82506b(null, this);
    }
}
