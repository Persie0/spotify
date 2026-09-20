package p204p;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class mj5 extends m5f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f144164b;

    /* JADX INFO: renamed from: c */
    public final fx80 f144165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj5(rr60 rr60Var, int i) {
        super(rr60Var);
        this.f144164b = i;
        switch (i) {
            case 1:
                super(rr60Var);
                this.f144165c = new kj5(rr60Var.getDescriptor(), 2);
                break;
            default:
                this.f144165c = new kj5(rr60Var.getDescriptor(), 0);
                break;
        }
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: a */
    public final Object mo61921a() {
        switch (this.f144164b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: b */
    public final int mo61922b(Object obj) {
        switch (this.f144164b) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        switch (this.f144164b) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
                return arrayList == null ? new ArrayList(list) : arrayList;
            default:
                Set set = (Set) obj;
                LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
                return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
        }
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        switch (this.f144164b) {
            case 0:
                break;
        }
        return (kj5) this.f144165c;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: h */
    public final Object mo61923h(Object obj) {
        switch (this.f144164b) {
            case 0:
                return (ArrayList) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // p204p.i4f
    /* JADX INFO: renamed from: i */
    public final void mo49673i(int i, Object obj, Object obj2) {
        switch (this.f144164b) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }
}
