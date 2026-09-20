package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ici0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f100824a;

    /* JADX INFO: renamed from: b */
    public int f100825b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b9s f100826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ici0(b9s b9sVar, fbk fbkVar) {
        super(fbkVar);
        this.f100826c = b9sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100824a = obj;
        this.f100825b |= Integer.MIN_VALUE;
        return this.f100826c.emit(null, this);
    }
}
