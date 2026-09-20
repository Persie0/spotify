package p204p;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class n80 {

    /* JADX INFO: renamed from: l */
    public static final n80 f151278l;

    /* JADX INFO: renamed from: m */
    public static final n80 f151279m;

    /* JADX INFO: renamed from: n */
    public static final n80 f151280n;

    /* JADX INFO: renamed from: o */
    public static final n80 f151281o;

    /* JADX INFO: renamed from: p */
    public static final n80 f151282p;

    /* JADX INFO: renamed from: a */
    public final int f151283a;

    /* JADX INFO: renamed from: b */
    public final int f151284b;

    /* JADX INFO: renamed from: c */
    public final int f151285c;

    /* JADX INFO: renamed from: d */
    public final boolean f151286d;

    /* JADX INFO: renamed from: e */
    public final boolean f151287e;

    /* JADX INFO: renamed from: f */
    public final boolean f151288f;

    /* JADX INFO: renamed from: g */
    public final boolean f151289g;

    /* JADX INFO: renamed from: h */
    public final uzb f151290h;

    /* JADX INFO: renamed from: i */
    public final HashSet f151291i;

    /* JADX INFO: renamed from: j */
    public final HashSet f151292j;

    /* JADX INFO: renamed from: k */
    public final HashSet f151293k;

    static {
        m80 m80Var = new m80();
        m80Var.f140881d = 1;
        m80Var.f140884g = true;
        m80Var.f140886i = false;
        n80 n80Var = new n80(m80Var);
        f151278l = n80Var;
        m80 m80Var2 = new m80();
        m80Var2.f140881d = 2;
        m80Var2.f140884g = true;
        m80Var2.f140886i = true;
        m80Var2.m61097b();
        m80 m80Var3 = new m80();
        m80Var3.f140888k = uzb.f235454b;
        m80Var3.f140881d = 2;
        n80 n80Var2 = new n80(m80Var3);
        m80 m80Var4 = new m80(n80Var2);
        uzb uzbVar = uzb.f235456d;
        m80Var4.f140888k = uzbVar;
        m80Var4.f140883f = 2;
        m80Var4.f140886i = true;
        m80Var4.m61097b();
        m80 m80Var5 = new m80(n80Var2);
        m80Var5.f140888k = uzbVar;
        m80Var5.f140883f = 2;
        m80Var5.f140882e = 1;
        m80Var5.f140886i = true;
        f151279m = new n80(m80Var5);
        m80 m80Var6 = new m80(n80Var2);
        m80Var6.f140883f = 1;
        m80Var6.f140888k = uzb.f235457e;
        m80Var6.f140886i = true;
        m80Var6.f140887j = true;
        m80Var6.m61097b();
        m80 m80Var7 = new m80(n80Var2);
        m80Var7.f140881d = 4;
        m80Var7.f140883f = 4;
        m80Var7.f140882e = 1;
        m80Var7.f140888k = uzb.f235458f;
        m80Var7.f140886i = true;
        m80Var7.f140887j = true;
        m80Var7.m61097b();
        m80 m80Var8 = new m80(n80Var2);
        m80Var8.f140881d = 4;
        m80Var8.f140882e = 1;
        m80Var8.f140886i = true;
        m80Var8.f140887j = true;
        m80Var8.m61097b();
        m80 m80Var9 = new m80();
        m80Var9.f140881d = 2;
        m80Var9.f140883f = 2;
        m80Var9.f140882e = 1;
        m80Var9.m61096a(1);
        m80Var9.m61096a(Action.TYPE_MEDIA_PLAYBACK);
        m80Var9.f140886i = true;
        f151280n = new n80(m80Var9);
        m80 m80Var10 = new m80();
        m80Var10.f140881d = 1;
        m80Var10.f140883f = 1;
        m80Var10.m61096a(1);
        m80Var10.f140884g = true;
        m80Var10.f140886i = true;
        m80Var10.m61097b();
        m80 m80Var11 = new m80();
        m80Var11.f140881d = 2;
        m80Var11.m61096a(1);
        m80Var11.m61096a(Action.TYPE_COMPOSE_MESSAGE);
        m80Var11.m61096a(Action.TYPE_MEDIA_PLAYBACK);
        m80Var11.f140884g = true;
        m80Var11.f140885h = true;
        m80Var11.f140886i = true;
        f151281o = new n80(m80Var11);
        m80 m80Var12 = new m80(n80Var);
        m80Var12.f140878a.add(Integer.valueOf(Action.TYPE_APP_ICON));
        f151282p = new n80(m80Var12);
        m80 m80Var13 = new m80(n80Var);
        m80Var13.m61096a(Action.TYPE_APP_ICON);
        m80Var13.m61096a(Action.TYPE_BACK);
        m80Var13.m61096a(1);
        m80Var13.m61097b();
        m80 m80Var14 = new m80();
        m80Var14.m61096a(1);
        m80Var14.f140884g = true;
        m80Var14.f140881d = 5;
        m80Var14.f140883f = 0;
        m80Var14.f140882e = 1;
        m80Var14.f140886i = true;
        m80Var14.m61097b();
        m80 m80Var15 = new m80(n80Var);
        m80Var15.m61096a(Action.TYPE_APP_ICON);
        m80Var15.m61096a(Action.TYPE_BACK);
        m80Var15.m61097b();
        m80 m80Var16 = new m80();
        m80Var16.f140881d = 1;
        m80Var16.f140886i = true;
        m80Var16.f140884g = true;
        m80Var16.m61096a(1);
        m80Var16.f140883f = 0;
        m80Var16.m61097b();
        m80 m80Var17 = new m80();
        m80Var17.f140881d = 2;
        m80Var17.f140883f = 2;
        m80Var17.f140886i = true;
        m80Var17.m61096a(1);
        m80Var17.m61097b();
        m80 m80Var18 = new m80();
        m80Var18.f140881d = 3;
        m80Var18.f140883f = 2;
        m80Var18.f140886i = true;
        m80Var18.m61096a(1);
        m80Var18.m61097b();
    }

    public n80(m80 m80Var) {
        int i = m80Var.f140881d;
        this.f151283a = i;
        this.f151284b = m80Var.f140882e;
        this.f151285c = m80Var.f140883f;
        this.f151290h = m80Var.f140888k;
        this.f151286d = m80Var.f140884g;
        this.f151287e = m80Var.f140885h;
        this.f151288f = m80Var.f140886i;
        this.f151289g = m80Var.f140887j;
        HashSet hashSet = new HashSet(m80Var.f140878a);
        this.f151291i = hashSet;
        HashSet hashSet2 = new HashSet(m80Var.f140880c);
        this.f151293k = hashSet2;
        HashSet hashSet3 = m80Var.f140879b;
        HashSet hashSet4 = new HashSet(hashSet3);
        hashSet4.retainAll(hashSet);
        if (!hashSet4.isEmpty()) {
            throw new IllegalArgumentException("Disallowed action types cannot also be in the required set");
        }
        if (!hashSet3.isEmpty() && !hashSet2.isEmpty()) {
            throw new IllegalArgumentException("Both disallowed and allowed action type set cannot be defined.");
        }
        this.f151292j = new HashSet(hashSet3);
        if (hashSet.size() > i) {
            throw new IllegalArgumentException("Required action types exceeded max allowed actions");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m63817a(List list) {
        HashSet hashSet = this.f151291i;
        Set hashSet2 = hashSet.isEmpty() ? Collections.EMPTY_SET : new HashSet(hashSet);
        Iterator it = list.iterator();
        int i = this.f151283a;
        int i2 = this.f151284b;
        int i3 = this.f151285c;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        while (it.hasNext()) {
            Action action = (Action) it.next();
            HashSet hashSet3 = this.f151292j;
            if (!hashSet3.isEmpty() && hashSet3.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()) + " is disallowed");
            }
            HashSet hashSet4 = this.f151293k;
            if (!hashSet4.isEmpty() && !hashSet4.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()) + " is not allowed");
            }
            hashSet2.remove(Integer.valueOf(action.getType()));
            CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i6--;
                if (i6 < 0) {
                    throw new IllegalArgumentException(edb.m38563l("Action list exceeded max number of ", i3, " actions with custom titles"));
                }
                this.f151290h.m84293b(title);
            }
            i4--;
            if (i4 < 0) {
                throw new IllegalArgumentException(edb.m38563l("Action list exceeded max number of ", i, " actions"));
            }
            if ((action.getFlags() & 1) != 0 && (i5 = i5 - 1) < 0) {
                throw new IllegalArgumentException(edb.m38563l("Action list exceeded max number of ", i2, " primary actions"));
            }
            if (this.f151286d && action.getIcon() == null && !action.isStandard()) {
                throw new IllegalArgumentException("Non-standard actions without an icon are disallowed");
            }
            boolean z = this.f151287e;
            if (z && ((action.getBackgroundColor() == null || CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard())) {
                throw new IllegalArgumentException("Non-standard actions without a background color are disallowed");
            }
            if (!z && !CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.f151289g && (action.getFlags() & 1) == 0) {
                throw new IllegalArgumentException("Background color can only be set for primary actions");
            }
            if (!this.f151288f && action.getOnClickDelegate() != null && !action.isStandard()) {
                throw new IllegalArgumentException("Setting a click listener for a custom action is disallowed");
            }
        }
        if (hashSet2.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            sb.append(Action.typeToString(((Integer) it2.next()).intValue()));
            sb.append(",");
        }
        throw new IllegalArgumentException(edb.m38569r(sb, "Missing required action types: "));
    }
}
