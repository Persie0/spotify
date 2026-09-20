package p204p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m24212d2 = {"Lp/ub70;", "Lp/hk60$e;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lp/p0i0;", "moshi", "Lp/hk60;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lp/p0i0;)Lp/hk60;", "moshi-kotlin"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class ub70 implements hk60.InterfaceC1945e {
    /* JADX WARN: Code duplicated, block: B:124:0x0244  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, p.fr70] */
    @Override // p204p.hk60.InterfaceC1945e
    public hk60<?> create(Type type, Set<? extends Annotation> annotations, p0i0 moshi) throws NoSuchMethodException {
        Object next;
        boolean z;
        Object next2;
        String name;
        Type typeM61888w;
        Object next3;
        Object obj = null;
        if (annotations.isEmpty()) {
            Class<?> clsM97293a = zze1.m97293a(type);
            if (!clsM97293a.isInterface() && !clsM97293a.isEnum() && clsM97293a.isAnnotationPresent(vb70.f239429a) && !f0b1.m40456j(clsM97293a)) {
                try {
                    hk60<?> hk60VarM40450d = f0b1.m40450d(moshi, type, clsM97293a);
                    if (hk60VarM40450d != null) {
                        return hk60VarM40450d;
                    }
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                }
                if (clsM97293a.isLocalClass()) {
                    throw new IllegalArgumentException("Cannot serialize local class or object expression ".concat(clsM97293a.getName()).toString());
                }
                up60 up60VarMo54112b = qpv0.f191387a.mo54112b(clsM97293a);
                if (up60VarMo54112b.mo29109B()) {
                    throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsM97293a.getName()).toString());
                }
                if (up60VarMo54112b.mo29114n()) {
                    throw new IllegalArgumentException("Cannot serialize inner class ".concat(clsM97293a.getName()).toString());
                }
                if (up60VarMo54112b.mo29115t() != null) {
                    throw new IllegalArgumentException("Cannot serialize object declaration ".concat(clsM97293a.getName()).toString());
                }
                if (up60VarMo54112b.mo29117x()) {
                    throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + clsM97293a.getName() + ". Please register an adapter.").toString());
                }
                Iterator it = up60VarMo54112b.mo29113l().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((fpv0) ((oq60) next)).mo32221p1());
                oq60 oq60Var = (oq60) next;
                if (oq60Var != null) {
                    List listMo25528e = oq60Var.mo25528e();
                    int iM31820L = c95.m31820L(i6f.m49804T(listMo25528e, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (Object obj2 : listMo25528e) {
                        linkedHashMap.put(((hr60) obj2).getName(), obj2);
                    }
                    kgg1.m56362y(oq60Var);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    lpv0 lpv0Var = ((zp60) ((cq60) up60VarMo54112b).f40746c.getValue()).f284956r;
                    qr60 qr60Var = zp60.f284940x[14];
                    Collection collection = (Collection) lpv0Var.invoke();
                    ArrayList<nr60> arrayList = new ArrayList();
                    Iterator it2 = collection.iterator();
                    while (true) {
                        z = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next4 = it2.next();
                        tvq tvqVar = (tvq) next4;
                        if (!(tvqVar.mo54484I().mo32017Q() != null) && (tvqVar instanceof nr60)) {
                            arrayList.add(next4);
                        }
                    }
                    for (nr60 nr60Var : arrayList) {
                        hr60 hr60Var = (hr60) linkedHashMap.get(nr60Var.getName());
                        kgg1.m56362y(nr60Var);
                        Iterator it3 = nr60Var.getAnnotations().iterator();
                        do {
                            if (!it3.hasNext()) {
                                next2 = obj;
                                break;
                            }
                            next2 = it3.next();
                        } while (!(((Annotation) next2) instanceof gk60));
                        gk60 gk60Var = (gk60) next2;
                        ArrayList arrayList2 = new ArrayList(nr60Var.getAnnotations());
                        if (hr60Var != null) {
                            j6f.m52564V(hr60Var.getAnnotations(), arrayList2);
                            if (gk60Var == null) {
                                Iterator it4 = hr60Var.getAnnotations().iterator();
                                do {
                                    if (!it4.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it4.next();
                                } while (!(((Annotation) next3) instanceof gk60));
                                gk60Var = (gk60) next3;
                            }
                        }
                        Field fieldM61884s = mif1.m61884s(nr60Var);
                        if (Modifier.isTransient(fieldM61884s != null ? fieldM61884s.getModifiers() : 0)) {
                            if (hr60Var != null && !hr60Var.mo42979L()) {
                                throw new IllegalArgumentException(("No default value for transient constructor " + hr60Var).toString());
                            }
                        } else if (gk60Var == null || gk60Var.ignore() != z) {
                            if (hr60Var != null && !wj50.m88271j(hr60Var.getType(), nr60Var.mo25530i())) {
                                throw new IllegalArgumentException(("'" + nr60Var.getName() + "' has a constructor parameter of type " + hr60Var.getType() + " but a property of type " + nr60Var.mo25530i() + '.').toString());
                            }
                            if ((nr60Var instanceof yq60) || hr60Var != null) {
                                if (gk60Var == null || (name = gk60Var.name()) == null) {
                                    name = nr60Var.getName();
                                } else {
                                    if (name.equals(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
                                        name = null;
                                    }
                                    if (name == null) {
                                        name = nr60Var.getName();
                                    }
                                }
                                String str = name;
                                kq60 kq60VarMo27067y = nr60Var.mo25530i().mo27067y();
                                if (kq60VarMo27067y instanceof up60) {
                                    up60 up60Var = (up60) kq60VarMo27067y;
                                    if (up60Var.mo29116u()) {
                                        typeM61888w = ((ife) up60Var).mo28587A();
                                        if (!nr60Var.mo25530i().mo27065K().isEmpty()) {
                                            List listMo27065K = nr60Var.mo25530i().mo27065K();
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator it5 = listMo27065K.iterator();
                                            while (it5.hasNext()) {
                                                sr60 sr60Var = ((xr60) it5.next()).f265275b;
                                                Type typeM61888w2 = sr60Var != null ? mif1.m61888w(sr60Var) : null;
                                                if (typeM61888w2 != null) {
                                                    arrayList3.add(typeM61888w2);
                                                }
                                            }
                                            Type[] typeArr = (Type[]) arrayList3.toArray(new Type[0]);
                                            typeM61888w = mp91.m62457j(typeM61888w, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                                        }
                                    } else {
                                        typeM61888w = mif1.m61888w(nr60Var.mo25530i());
                                    }
                                } else {
                                    if (!(kq60VarMo27067y instanceof ur60)) {
                                        throw new IllegalStateException("Not possible!");
                                    }
                                    typeM61888w = mif1.m61888w(nr60Var.mo25530i());
                                }
                                linkedHashMap2.put(nr60Var.getName(), new tb70.C2408a(str, moshi.m68706f(f0b1.m40463q(type, clsM97293a, typeM61888w), f0b1.m40458l((Annotation[]) arrayList2.toArray(new Annotation[0])), nr60Var.getName()), nr60Var, hr60Var, hr60Var != null ? hr60Var.getIndex() : -1));
                                obj = null;
                                z = true;
                            }
                        } else if (hr60Var != null && !hr60Var.mo42979L()) {
                            throw new IllegalArgumentException(("No default value for ignored constructor " + hr60Var).toString());
                        }
                        obj = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (hr60 hr60Var2 : oq60Var.mo25528e()) {
                        tb70.C2408a c2408a = (tb70.C2408a) zn91.m96561l(linkedHashMap2).remove(hr60Var2.getName());
                        if (c2408a == null && !hr60Var2.mo42979L()) {
                            throw new IllegalArgumentException(("No property for required constructor " + hr60Var2).toString());
                        }
                        arrayList4.add(c2408a);
                    }
                    int size = arrayList4.size();
                    Iterator it6 = linkedHashMap2.entrySet().iterator();
                    while (true) {
                        int i = size;
                        if (!it6.hasNext()) {
                            break;
                        }
                        size = i + 1;
                        arrayList4.add(tb70.C2408a.m80379b((tb70.C2408a) ((Map.Entry) it6.next()).getValue(), null, null, null, null, i, 15, null));
                    }
                    ArrayList arrayListM43737o0 = g6f.m43737o0(arrayList4);
                    ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayListM43737o0, 10));
                    Iterator it7 = arrayListM43737o0.iterator();
                    while (it7.hasNext()) {
                        arrayList5.add(((tb70.C2408a) it7.next()).getJsonName());
                    }
                    String[] strArr = (String[]) arrayList5.toArray(new String[0]);
                    return new tb70(oq60Var, arrayList4, arrayListM43737o0, xl60.C2578b.m91389a((String[]) Arrays.copyOf(strArr, strArr.length))).nullSafe();
                }
            }
        }
        return null;
    }
}
