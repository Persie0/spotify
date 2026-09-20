package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class knz extends mnz {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f124488b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f124489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knz(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.f124489c = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f124488b) {
            case 0:
                return ((Iterable) this.f124489c).iterator();
            default:
                lnz lnzVar = new lnz(this, ((Iterable[]) this.f124489c).length);
                qw50 qw50Var = new qw50();
                qw50Var.f193174b = pw50.f181916e;
                qw50Var.f193175c = lnzVar;
                return qw50Var;
        }
    }

    public knz(Iterable[] iterableArr) {
        this.f124489c = iterableArr;
    }
}
