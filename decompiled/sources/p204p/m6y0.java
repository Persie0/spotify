package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m6y0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final m6y0 f140599a = new m6y0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        ArrayList arrayList;
        gbu gbuVar;
        u6y0 u6y0Var;
        int i;
        ArrayList arrayList2;
        s6y0 s6y0VarM77350a = (s6y0) obj;
        l6y0 l6y0Var = (l6y0) obj2;
        boolean z = l6y0Var instanceof d6y0;
        gbu gbuVar2 = gbu.f78413a;
        u6y0 u6y0Var2 = u6y0.NOTHING;
        lau lauVar = lau.f131415a;
        u6y0 u6y0Var3 = u6y0.UPLOAD_IMAGE;
        u6y0 u6y0Var4 = u6y0.GET_CORE_PROFILE_DATA;
        if (!z) {
            if (l6y0Var instanceof z5y0) {
                return Next.m15607i(s6y0.m77350a(s6y0VarM77350a, 1, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, lauVar, lauVar, u6y0Var2, 8388606), s6y0VarM77350a.f206237r == u6y0Var3 ? Collections.singleton(new u5y0("")) : gbuVar2);
            }
            if (l6y0Var instanceof k6y0) {
                k6y0 k6y0Var = (k6y0) l6y0Var;
                return k6y0Var.f119866a.length() == 0 ? Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862)) : mkr0.m62180d(s6y0.m77350a(s6y0VarM77350a, 0, 0.0f, k6y0Var.f119866a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108859), gbuVar2);
            }
            if (l6y0Var instanceof b6y0) {
                b6y0 b6y0Var = (b6y0) l6y0Var;
                String str = b6y0Var.f24075c;
                if (!b6y0Var.f24073a) {
                    return Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
                }
                s6y0 s6y0VarM77350a2 = s6y0.m77350a(s6y0VarM77350a, 0, 0.0f, null, null, b6y0Var.f24074b, str, null, null, null, null, null, null, null, null, null, null, null, null, 67108815);
                if (s6y0VarM77350a2.f206237r == u6y0Var4) {
                    return mkr0.m62180d(s6y0.m77350a(s6y0VarM77350a2, 0, 0.0f, null, null, null, null, b6y0Var.f24074b, str, null, null, null, null, null, null, null, null, null, null, 67107327), gbuVar2);
                }
                return mkr0.m62178a(s6y0VarM77350a2) ? mkr0.m62180d(s6y0VarM77350a2, Collections.singleton(new l5y0(false))) : Next.m15606h(s6y0VarM77350a2);
            }
            if (l6y0Var instanceof j6y0) {
                j6y0 j6y0Var = (j6y0) l6y0Var;
                if (!j6y0Var.f109427a) {
                    return Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
                }
                String str2 = j6y0Var.f109428b;
                if (str2 != null) {
                    return str2.length() > 0 ? mkr0.m62180d(s6y0.m77350a(s6y0VarM77350a, 0, 0.0f, null, j6y0Var.f109428b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108855), gbuVar2) : Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
                }
                return Next.m15606h(mkr0.m62184h(s6y0VarM77350a, j6y0Var.f109429c));
            }
            if (l6y0Var instanceof f6y0) {
                return ((f6y0) l6y0Var).f66515a ? mkr0.m62180d(s6y0VarM77350a, gbuVar2) : Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (l6y0Var instanceof c6y0) {
                return ((c6y0) l6y0Var).f34645a ? mkr0.m62180d(s6y0VarM77350a, gbuVar2) : Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (l6y0Var instanceof e6y0) {
                return ((e6y0) l6y0Var).f56776a ? mkr0.m62180d(s6y0VarM77350a, gbuVar2) : Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (l6y0Var instanceof i6y0) {
                return ((i6y0) l6y0Var).f99382a ? mkr0.m62180d(s6y0VarM77350a, gbuVar2) : Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (l6y0Var instanceof a6y0) {
                if (((a6y0) l6y0Var).f12892a) {
                    return mkr0.m62180d(s6y0VarM77350a, gbuVar2);
                }
                return mkr0.m62178a(s6y0VarM77350a) ? mkr0.m62180d(s6y0VarM77350a, Collections.singleton(new l5y0(false))) : Next.m15606h(s6y0VarM77350a);
            }
            if (l6y0Var instanceof h6y0) {
                return ((h6y0) l6y0Var).f88294a ? mkr0.m62180d(s6y0VarM77350a, gbuVar2) : Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (l6y0Var instanceof g6y0) {
                return ((g6y0) l6y0Var).f77141a ? mkr0.m62180d(s6y0VarM77350a, gbuVar2) : Next.m15606h(s6y0.m77350a(s6y0VarM77350a, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            throw new NoWhenBranchMatchedException();
        }
        d6y0 d6y0Var = (d6y0) l6y0Var;
        if (s6y0VarM77350a.f206220a == 2) {
            return Next.m15608j();
        }
        ArrayList arrayList3 = new ArrayList();
        if (s6y0VarM77350a.f206222c.length() == 0) {
            arrayList3.add(u6y0.GET_USERNAME);
        }
        arrayList3.add(u6y0Var4);
        if (d6y0Var.f45922a != null) {
            arrayList3.add(u6y0.SET_DISPLAY_NAME);
            i = 2;
            gbuVar = gbuVar2;
            u6y0Var = u6y0Var3;
            arrayList = arrayList3;
            s6y0VarM77350a = s6y0.m77350a(s6y0VarM77350a, 0, 0.0f, null, null, null, null, null, null, d6y0Var.f45922a, null, null, null, null, null, null, null, null, null, 67043327);
        } else {
            arrayList = arrayList3;
            gbuVar = gbuVar2;
            u6y0Var = u6y0Var3;
            i = 2;
        }
        s6y0 s6y0VarM77350a3 = s6y0VarM77350a;
        if (d6y0Var.f45924c == null && d6y0Var.f45925d == null && d6y0Var.f45926e == null) {
            arrayList2 = arrayList;
        } else {
            arrayList2 = arrayList;
            arrayList2.add(u6y0.SET_PROFILE_DETAILS);
            s6y0VarM77350a3 = s6y0.m77350a(s6y0VarM77350a3, 0, 0.0f, null, null, null, null, null, null, null, null, null, null, d6y0Var.f45924c, d6y0Var.f45925d, d6y0Var.f45926e, null, null, null, 59768831);
        }
        s6y0 s6y0VarM77350a4 = s6y0VarM77350a3;
        String str3 = d6y0Var.f45923b;
        if (str3 != null) {
            if (str3.length() == 0) {
                arrayList2.add(u6y0.REMOVE_IMAGE);
                s6y0VarM77350a4 = s6y0.m77350a(s6y0VarM77350a4, 0, 0.0f, null, null, null, null, null, null, null, "", null, null, null, null, null, null, null, null, 66977791);
            } else {
                arrayList2.add(u6y0Var);
                arrayList2.add(u6y0.SET_IMAGE);
                s6y0VarM77350a4 = s6y0.m77350a(s6y0VarM77350a4, 0, 0.0f, null, null, null, null, null, null, null, d6y0Var.f45923b, null, null, null, null, null, null, null, null, 66977791);
            }
        }
        s6y0 s6y0VarM77350a5 = s6y0VarM77350a4;
        if (d6y0Var.f45927f != null) {
            arrayList2.add(u6y0.SET_KIDS_COLOR);
            s6y0VarM77350a5 = s6y0.m77350a(s6y0VarM77350a5, 0, 0.0f, null, null, null, null, null, null, null, null, d6y0Var.f45927f, null, null, null, null, null, null, null, 66846719);
        }
        s6y0 s6y0VarM77350a6 = s6y0VarM77350a5;
        if (d6y0Var.f45928g != null) {
            arrayList2.add(u6y0.SET_KIDS_AVATAR);
            s6y0VarM77350a6 = s6y0.m77350a(s6y0VarM77350a6, 0, 0.0f, null, null, null, null, null, null, null, null, null, d6y0Var.f45928g, null, null, null, null, null, null, 66584575);
        }
        arrayList2.add(u6y0.CONFIRM_CHANGES);
        return mkr0.m62180d(s6y0.m77350a(s6y0VarM77350a6, i, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList2, lauVar, u6y0Var2, 8388606), gbuVar);
    }
}
