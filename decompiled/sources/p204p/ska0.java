package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ska0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final ska0 f210067a = new ska0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        wka0 wka0Var = (wka0) obj;
        ika0 ika0Var = (ika0) obj2;
        String str = wka0Var.f252176c;
        String str2 = wka0Var.f252174a;
        if (ika0Var instanceof gka0) {
            String str3 = ((gka0) ika0Var).f80767a;
            return str3.length() == 0 ? Next.m15606h(wka0.m88362c(wka0Var, null, null, str3, lau.f131415a, 1, null, 35)) : Next.m15607i(wka0.m88362c(wka0Var, null, null, str3, null, 2, null, 43), Collections.singleton(new cia0(str3)));
        }
        if (ika0Var instanceof wja0) {
            qfa0 qfa0Var = ((wja0) ika0Var).f251921a;
            return Next.m15605a(bk5.m29624m1(new elf1[]{new dia0(qfa0Var, str2), new bia0(qfa0Var), new aia0(qfa0Var)}));
        }
        if (ika0Var instanceof cka0) {
            qfa0 qfa0Var2 = ((cka0) ika0Var).f38905a;
            return Next.m15605a(bk5.m29624m1(new elf1[]{new dia0(qfa0Var2, str2), new bia0(qfa0Var2), new aia0(qfa0Var2)}));
        }
        if (ika0Var instanceof rja0) {
            qfa0 qfa0Var3 = wka0Var.f252175b;
            return qfa0Var3 == null ? Next.m15608j() : Next.m15605a(bk5.m29624m1(new elf1[]{new dia0(qfa0Var3, str2), oha0.f165382c}));
        }
        if (ika0Var instanceof nja0) {
            return Next.m15605a(Collections.singleton(wha0.f251293c));
        }
        if (ika0Var instanceof hka0) {
            hka0 hka0Var = (hka0) ika0Var;
            ArrayList arrayList = hka0Var.f92403b;
            if (wj50.m88271j(hka0Var.f92402a, str)) {
                return Next.m15606h(wka0.m88362c(wka0Var, null, null, null, arrayList, arrayList.isEmpty() ? 4 : 3, null, 39));
            }
            return Next.m15608j();
        }
        if (ika0Var instanceof fka0) {
            return !wj50.m88271j(((fka0) ika0Var).f70515a, str) ? Next.m15608j() : Next.m15606h(wka0.m88362c(wka0Var, null, null, null, null, 5, null, 47));
        }
        if (!(ika0Var instanceof eka0)) {
            if (ika0Var instanceof qja0) {
                return Next.m15606h(wka0.m88362c(wka0Var, null, ((qja0) ika0Var).f189203a, null, null, 0, null, 61));
            }
            throw new NoWhenBranchMatchedException();
        }
        List list = wka0Var.f252179f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (!wj50.m88271j((qfa0) obj3, ((eka0) ika0Var).f60420a)) {
                arrayList2.add(obj3);
            }
        }
        return Next.m15607i(wka0.m88362c(wka0Var, null, null, null, null, 0, arrayList2, 31), Collections.singleton(new qha0(((eka0) ika0Var).f60420a)));
    }
}
