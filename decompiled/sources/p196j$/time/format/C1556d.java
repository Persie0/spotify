package p196j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: j$.time.format.d */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1556d implements InterfaceC1557e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1557e[] f10712a;

    /* JADX INFO: renamed from: b */
    public final boolean f10713b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1556d(List list, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        this((InterfaceC1557e[]) arrayList.toArray(new InterfaceC1557e[arrayList.size()]), z);
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: E */
    public final int mo24064E(C1570r c1570r, CharSequence charSequence, int i) {
        boolean z = this.f10713b;
        InterfaceC1557e[] interfaceC1557eArr = this.f10712a;
        int i2 = 0;
        if (!z) {
            int length = interfaceC1557eArr.length;
            while (i2 < length) {
                i = interfaceC1557eArr[i2].mo24064E(c1570r, charSequence, i);
                if (i < 0) {
                    return i;
                }
                i2++;
            }
            return i;
        }
        ArrayList arrayList = c1570r.f10755d;
        C1574v c1574vM24095c = c1570r.m24095c();
        c1574vM24095c.getClass();
        C1574v c1574v = new C1574v();
        ((HashMap) c1574v.f10760a).putAll(c1574vM24095c.f10760a);
        c1574v.f10761b = c1574vM24095c.f10761b;
        c1574v.f10762c = c1574vM24095c.f10762c;
        c1574v.f10763d = c1574vM24095c.f10763d;
        arrayList.add(c1574v);
        int length2 = interfaceC1557eArr.length;
        int iMo24064E = i;
        while (i2 < length2) {
            iMo24064E = interfaceC1557eArr[i2].mo24064E(c1570r, charSequence, iMo24064E);
            if (iMo24064E < 0) {
                ArrayList arrayList2 = c1570r.f10755d;
                arrayList2.remove(arrayList2.size() - 1);
                return i;
            }
            i2++;
        }
        ArrayList arrayList3 = c1570r.f10755d;
        arrayList3.remove(arrayList3.size() - 2);
        return iMo24064E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r8.f10758c--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo24065r(C1571s c1571s, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.f10713b;
        if (z) {
            c1571s.f10758c++;
        }
        try {
            for (InterfaceC1557e interfaceC1557e : this.f10712a) {
                if (!interfaceC1557e.mo24065r(c1571s, sb)) {
                    sb.setLength(length);
                }
            }
        } catch (Throwable th) {
            if (z) {
                c1571s.f10758c--;
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC1557e[] interfaceC1557eArr = this.f10712a;
        if (interfaceC1557eArr != null) {
            boolean z = this.f10713b;
            sb.append(z ? "[" : "(");
            for (InterfaceC1557e interfaceC1557e : interfaceC1557eArr) {
                sb.append(interfaceC1557e);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    public C1556d(InterfaceC1557e[] interfaceC1557eArr, boolean z) {
        this.f10712a = interfaceC1557eArr;
        this.f10713b = z;
    }
}
