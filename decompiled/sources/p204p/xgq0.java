package p204p;

import com.spotify.notifications.models.preferences.Item$Group;
import com.spotify.notifications.models.preferences.Item$Preference;
import com.spotify.notifications.models.preferences.OptOutRecord;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class xgq0 {

    /* JADX INFO: renamed from: a */
    public final vgq0 f261365a;

    /* JADX INFO: renamed from: b */
    public final f2k0 f261366b;

    /* JADX INFO: renamed from: c */
    public final PublishSubject f261367c = new PublishSubject();

    public xgq0(vgq0 vgq0Var, f2k0 f2k0Var) {
        this.f261365a = vgq0Var;
        this.f261366b = f2k0Var;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m90932b(Item$Group item$Group) {
        Iterable iterableM90932b;
        List<wq50> list = item$Group.items;
        ArrayList arrayList = new ArrayList();
        for (wq50 wq50Var : list) {
            if (wq50Var instanceof Item$Preference) {
                iterableM90932b = Collections.singletonList(wq50Var);
            } else {
                if (!(wq50Var instanceof Item$Group)) {
                    throw new NoWhenBranchMatchedException();
                }
                iterableM90932b = m90932b((Item$Group) wq50Var);
            }
            j6f.m52564V(iterableM90932b, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final CompletableOnErrorComplete m90933a(lmc lmcVar, int i, String str) {
        String strName;
        String lowerCase = null;
        lmc lmcVar2 = lmcVar == lmc.f134855c ? null : lmcVar;
        if (lmcVar2 != null && (strName = lmcVar2.name()) != null) {
            lowerCase = strName.toLowerCase(Locale.ROOT);
        }
        return this.f261365a.m85495a(lowerCase, z0k0.m95071h(i), str).m23295g(new jn10(12, this, lmcVar)).m23299p(Functions.f7232h);
    }

    /* JADX INFO: renamed from: c */
    public final Single m90934c(srl0 srl0Var, int i, String str) {
        List listSingletonList = Collections.singletonList(srl0Var);
        return this.f261365a.m85497d(ihf1.m50632p(), z0k0.m95071h(i), str, this.f261366b.f65203a.m74792g()).map(new ayz(this, listSingletonList)).map(new m8p0(srl0Var, 2));
    }

    /* JADX INFO: renamed from: d */
    public final Completable m90935d(yrl0[] yrl0VarArr, int i, String str) {
        if (yrl0VarArr.length == 0) {
            return CompletableEmpty.f7437a;
        }
        ArrayList arrayList = new ArrayList(yrl0VarArr.length);
        for (yrl0 yrl0Var : yrl0VarArr) {
            arrayList.add(new OptOutRecord(yrl0Var.f275503b.f213355a, yrl0Var.f275502a.name().toLowerCase(Locale.ROOT), yrl0Var.f275504c));
        }
        return this.f261365a.m85496b(arrayList, z0k0.m95071h(i), str).m23295g(new jn10(13, yrl0VarArr, this));
    }
}
