package p204p;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class zc60 {

    /* JADX INFO: renamed from: a */
    public static final Object f281465a = kkc0.m56695h0(new pqm0("PACKAGE", EnumSet.noneOf(fd70.class)), new pqm0("TYPE", EnumSet.of(fd70.CLASS, fd70.FILE)), new pqm0("ANNOTATION_TYPE", EnumSet.of(fd70.ANNOTATION_CLASS)), new pqm0("TYPE_PARAMETER", EnumSet.of(fd70.TYPE_PARAMETER)), new pqm0("FIELD", EnumSet.of(fd70.FIELD)), new pqm0("LOCAL_VARIABLE", EnumSet.of(fd70.LOCAL_VARIABLE)), new pqm0("PARAMETER", EnumSet.of(fd70.VALUE_PARAMETER)), new pqm0("CONSTRUCTOR", EnumSet.of(fd70.CONSTRUCTOR)), new pqm0("METHOD", EnumSet.of(fd70.FUNCTION, fd70.PROPERTY_GETTER, fd70.PROPERTY_SETTER)), new pqm0("TYPE_USE", EnumSet.of(fd70.TYPE)));

    /* JADX INFO: renamed from: b */
    public static final Object f281466b = kkc0.m56695h0(new pqm0("RUNTIME", ed70.f58468a), new pqm0("CLASS", ed70.f58469b), new pqm0("SOURCE", ed70.f58470c));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static ak5 m95900a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof qov0) {
                arrayList.add(obj);
            }
        }
        ArrayList<fd70> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f281465a.get(qti0.m73841e(((qov0) it.next()).f191072b.name()).m73844b());
            if (iterable == null) {
                iterable = gbu.f78413a;
            }
            j6f.m52564V(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
        for (fd70 fd70Var : arrayList2) {
            y400 y400Var = qm41.f190120u;
            arrayList3.add(new wzv(new vfe(y400Var.m92786b(), y400Var.f269048a.m95306g()), qti0.m73841e(fd70Var.name())));
        }
        return new ak5(arrayList3, mxq.f148134L0);
    }
}
