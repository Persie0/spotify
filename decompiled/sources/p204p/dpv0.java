package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dpv0 implements cpv0 {

    /* JADX INFO: renamed from: a */
    public final lpv0 f51757a = kgg1.m56357t(null, new gtu0(0, this, epv0.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1, 0, 1));

    @Override // p204p.rp60
    /* JADX INFO: renamed from: j */
    public final Object mo36585j(Object... objArr) {
        try {
            return getCaller().mo25448j(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: r */
    public final Object mo36586r(tb70.C2409b c2409b) throws IllegalCallableAccessException {
        Object objM39693m;
        boolean z = false;
        if (epv0.m39705y(this)) {
            List<hr60> listMo25528e = mo25528e();
            ArrayList arrayList = new ArrayList(i6f.m49804T(listMo25528e, 10));
            for (hr60 hr60Var : listMo25528e) {
                if (c2409b.containsKey(hr60Var)) {
                    objM39693m = c2409b.get(hr60Var);
                    if (objM39693m == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + hr60Var + ')');
                    }
                } else if (hr60Var.mo42979L()) {
                    objM39693m = null;
                } else {
                    if (!hr60Var.mo42978H()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + hr60Var);
                    }
                    objM39693m = epv0.m39693m(hr60Var.getType());
                }
                arrayList.add(objM39693m);
            }
            lbb lbbVarMo25533o = mo25533o();
            if (lbbVarMo25533o != null) {
                try {
                    return lbbVarMo25533o.mo25448j(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            throw new cvk("This callable does not support a default call: " + this);
        }
        List<hr60> listMo25528e2 = mo25528e();
        if (listMo25528e2.isEmpty()) {
            try {
                return getCaller().mo25448j(mo25529h() ? new fbk[]{null} : new fbk[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (mo25529h() ? 1 : 0) + listMo25528e2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f51757a.invoke()).clone();
        if (mo25529h()) {
            objArr[listMo25528e2.size()] = null;
        }
        int i = 0;
        for (hr60 hr60Var2 : listMo25528e2) {
            if (c2409b.containsKey(hr60Var2)) {
                objArr[hr60Var2.getIndex()] = c2409b.get(hr60Var2);
            } else if (hr60Var2.mo42979L()) {
                int i2 = (i / 32) + size;
                objArr[i2] = Integer.valueOf(((Integer) objArr[i2]).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!hr60Var2.mo42978H()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + hr60Var2);
            }
            if (hr60Var2.getKind() == 4 || hr60Var2.getKind() == 2) {
                i++;
            }
        }
        if (!z) {
            try {
                return getCaller().mo25448j(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        lbb lbbVarMo25533o2 = mo25533o();
        if (lbbVarMo25533o2 != null) {
            try {
                return lbbVarMo25533o2.mo25448j(objArr);
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        throw new cvk("This callable does not support a default call: " + this);
    }
}
