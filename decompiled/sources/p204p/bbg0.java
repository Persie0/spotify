package p204p;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class bbg0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25560a;

    /* JADX INFO: renamed from: b */
    public final zt91 f25561b;

    public bbg0(String str, int i) {
        this.f25560a = i;
        switch (i) {
            case 12:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-checkout-webview";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = str;
                this.f25561b = yt91VarM50626j.m94607a();
                break;
            case 18:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-gen-alpha-blocked-entity-dialog";
                yt91VarM50626j2.f276052f = "1.2.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276050d = str;
                this.f25561b = yt91VarM50626j2.m94607a();
                break;
            case 27:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-share-chapter-selector";
                yt91VarM50626j3.f276052f = "1.1.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276050d = str;
                this.f25561b = yt91VarM50626j3.m94607a();
                break;
            default:
                st91 st91Var2 = st91.f213865b;
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-android-auto-content-error";
                yt91VarM50626j4.f276052f = "2.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91VarM50626j4.f276050d = str;
                this.f25561b = yt91VarM50626j4.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f25560a;
        lau lauVar = lau.f131415a;
        zt91 zt91Var = this.f25561b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList.add(zt91Var);
                return new st91(arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList2.add(zt91Var);
                return new st91(arrayList2);
            case 2:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList3.add(zt91Var);
                return new st91(arrayList3);
            case 3:
                st91 st91Var7 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 4:
                st91 st91Var8 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 5:
                st91 st91Var9 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 6:
                st91 st91Var10 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 7:
                st91 st91Var11 = st91.f213865b;
                st91 st91Var12 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList4.add(zt91Var);
                return new st91(arrayList4);
            case 8:
                st91 st91Var13 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 9:
                st91 st91Var14 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 10:
                st91 st91Var15 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 11:
                st91 st91Var16 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 12:
                st91 st91Var17 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 13:
                st91 st91Var18 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 14:
                st91 st91Var19 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 15:
                st91 st91Var20 = st91.f213865b;
                st91 st91Var21 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList5.add(zt91Var);
                return new st91(arrayList5);
            case 16:
                st91 st91Var22 = st91.f213865b;
                st91 st91Var23 = st91.f213865b;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList6.add(zt91Var);
                return new st91(arrayList6);
            case 17:
                st91 st91Var24 = st91.f213865b;
                st91 st91Var25 = st91.f213865b;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList7.add(zt91Var);
                return new st91(arrayList7);
            case 18:
                st91 st91Var26 = st91.f213865b;
                st91 st91Var27 = st91.f213865b;
                ArrayList arrayList8 = new ArrayList();
                arrayList8.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList8.add(zt91Var);
                return new st91(arrayList8);
            case 19:
                st91 st91Var28 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 20:
                st91 st91Var29 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 21:
                st91 st91Var30 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 22:
                st91 st91Var31 = st91.f213865b;
                st91 st91Var32 = st91.f213865b;
                ArrayList arrayList9 = new ArrayList();
                arrayList9.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList9.add(zt91Var);
                return new st91(arrayList9);
            case 23:
                st91 st91Var33 = st91.f213865b;
                st91 st91Var34 = st91.f213865b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList10.add(zt91Var);
                return new st91(arrayList10);
            case 24:
                st91 st91Var35 = st91.f213865b;
                st91 st91Var36 = st91.f213865b;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList11.add(zt91Var);
                return new st91(arrayList11);
            case 25:
                st91 st91Var37 = st91.f213865b;
                st91 st91Var38 = st91.f213865b;
                ArrayList arrayList12 = new ArrayList();
                arrayList12.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList12.add(zt91Var);
                return new st91(arrayList12);
            case 26:
                st91 st91Var39 = st91.f213865b;
                st91 st91Var40 = st91.f213865b;
                ArrayList arrayList13 = new ArrayList();
                arrayList13.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList13.add(zt91Var);
                return new st91(arrayList13);
            case 27:
                st91 st91Var41 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 28:
                st91 st91Var42 = st91.f213865b;
                st91 st91Var43 = st91.f213865b;
                ArrayList arrayList14 = new ArrayList();
                arrayList14.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList14.add(zt91Var);
                return new st91(arrayList14);
            default:
                st91 st91Var44 = st91.f213865b;
                st91 st91Var45 = st91.f213865b;
                ArrayList arrayList15 = new ArrayList();
                arrayList15.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList15.add(zt91Var);
                return new st91(arrayList15);
        }
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f25560a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f25561b;
                nu91Var.f248108b = st91.f213865b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var.m87248a();
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f25561b;
                nu91Var2.f248108b = st91.f213865b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var2.m87248a();
            case 2:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f25561b;
                nu91Var3.f248108b = st91.f213865b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var3.m87248a();
            case 3:
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = this.f25561b;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var4.m87248a();
            case 4:
                nu91 nu91Var5 = new nu91();
                nu91Var5.f248107a = this.f25561b;
                nu91Var5.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var5.m87248a();
            case 5:
                nu91 nu91Var6 = new nu91();
                nu91Var6.f248107a = this.f25561b;
                nu91Var6.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var6.m87248a();
            case 6:
                nu91 nu91Var7 = new nu91();
                nu91Var7.f248107a = this.f25561b;
                nu91Var7.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var7.m87248a();
            case 7:
                nu91 nu91Var8 = new nu91();
                nu91Var8.f248107a = this.f25561b;
                nu91Var8.f248108b = st91.f213865b;
                nu91Var8.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var8.m87248a();
            case 8:
                nu91 nu91Var9 = new nu91();
                nu91Var9.f248107a = this.f25561b;
                nu91Var9.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var9.m87248a();
            case 9:
                nu91 nu91Var10 = new nu91();
                nu91Var10.f248107a = this.f25561b;
                nu91Var10.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var10.m87248a();
            case 10:
                nu91 nu91Var11 = new nu91();
                nu91Var11.f248107a = this.f25561b;
                nu91Var11.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var11.m87248a();
            case 11:
                nu91 nu91Var12 = new nu91();
                nu91Var12.f248107a = this.f25561b;
                nu91Var12.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var12.m87248a();
            case 12:
                nu91 nu91Var13 = new nu91();
                nu91Var13.f248107a = this.f25561b;
                nu91Var13.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var13.m87248a();
            case 13:
                nu91 nu91Var14 = new nu91();
                nu91Var14.f248107a = this.f25561b;
                nu91Var14.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var14.m87248a();
            case 14:
                nu91 nu91Var15 = new nu91();
                nu91Var15.f248107a = this.f25561b;
                nu91Var15.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var15.m87248a();
            case 15:
                nu91 nu91Var16 = new nu91();
                nu91Var16.f248107a = this.f25561b;
                nu91Var16.f248108b = st91.f213865b;
                nu91Var16.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var16.m87248a();
            case 16:
                nu91 nu91Var17 = new nu91();
                nu91Var17.f248107a = this.f25561b;
                nu91Var17.f248108b = st91.f213865b;
                nu91Var17.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var17.m87248a();
            case 17:
                nu91 nu91Var18 = new nu91();
                nu91Var18.f248107a = this.f25561b;
                nu91Var18.f248108b = st91.f213865b;
                nu91Var18.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var18.m87248a();
            case 18:
                nu91 nu91Var19 = new nu91();
                nu91Var19.f248107a = this.f25561b;
                nu91Var19.f248108b = st91.f213865b;
                nu91Var19.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var19.m87248a();
            case 19:
                nu91 nu91Var20 = new nu91();
                nu91Var20.f248107a = this.f25561b;
                nu91Var20.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var20.m87248a();
            case 20:
                nu91 nu91Var21 = new nu91();
                nu91Var21.f248107a = this.f25561b;
                nu91Var21.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var21.m87248a();
            case 21:
                nu91 nu91Var22 = new nu91();
                nu91Var22.f248107a = this.f25561b;
                nu91Var22.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var22.m87248a();
            case 22:
                nu91 nu91Var23 = new nu91();
                nu91Var23.f248107a = this.f25561b;
                nu91Var23.f248108b = st91.f213865b;
                nu91Var23.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var23.m87248a();
            case 23:
                nu91 nu91Var24 = new nu91();
                nu91Var24.f248107a = this.f25561b;
                nu91Var24.f248108b = st91.f213865b;
                nu91Var24.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var24.m87248a();
            case 24:
                nu91 nu91Var25 = new nu91();
                nu91Var25.f248107a = this.f25561b;
                nu91Var25.f248108b = st91.f213865b;
                nu91Var25.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var25.m87248a();
            case 25:
                nu91 nu91Var26 = new nu91();
                nu91Var26.f248107a = this.f25561b;
                nu91Var26.f248108b = st91.f213865b;
                nu91Var26.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var26.m87248a();
            case 26:
                nu91 nu91Var27 = new nu91();
                nu91Var27.f248107a = this.f25561b;
                nu91Var27.f248108b = st91.f213865b;
                nu91Var27.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var27.m87248a();
            case 27:
                nu91 nu91Var28 = new nu91();
                nu91Var28.f248107a = this.f25561b;
                nu91Var28.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var28.m87248a();
            case 28:
                nu91 nu91Var29 = new nu91();
                nu91Var29.f248107a = this.f25561b;
                nu91Var29.f248108b = st91.f213865b;
                nu91Var29.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var29.m87248a();
            default:
                nu91 nu91Var30 = new nu91();
                nu91Var30.f248107a = this.f25561b;
                nu91Var30.f248108b = st91.f213865b;
                nu91Var30.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var30.m87248a();
        }
    }

    /* JADX INFO: renamed from: h */
    public av91 m28637h() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f25561b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public sag0 m28638i() {
        return new sag0(this, 12);
    }

    public bbg0(int i) {
        this.f25560a = i;
        switch (i) {
            case 3:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-artist-list-bottom-sheet";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j.m94607a();
                break;
            case 4:
            case 8:
            case 10:
            case 11:
            case 12:
            case 18:
            case 21:
            case 23:
            case 26:
            case 27:
            default:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-artist-attribution";
                yt91VarM50626j2.f276052f = "2.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j2.m94607a();
                break;
            case 5:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-carapplibrary-widget";
                yt91VarM50626j3.f276052f = "2.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j3.m94607a();
                break;
            case 6:
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-chat-permission";
                yt91VarM50626j4.f276052f = "2.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j4.m94607a();
                break;
            case 7:
                st91 st91Var2 = st91.f213865b;
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-chat-stickers-suggestions";
                yt91VarM50626j5.f276052f = "1.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j5.m94607a();
                break;
            case 9:
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-checkout-gpb-countrypicker";
                yt91VarM50626j6.f276052f = "2.0.0";
                yt91VarM50626j6.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j6.m94607a();
                break;
            case 13:
                zt91 zt91Var7 = zt91.f286105i;
                yt91 yt91VarM50626j7 = ihf1.m50626j();
                yt91VarM50626j7.f276054h = "music";
                yt91VarM50626j7.f276047a = "mobile-churn-lock-state-android";
                yt91VarM50626j7.f276052f = "2.0.0";
                yt91VarM50626j7.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j7.m94607a();
                break;
            case 14:
                zt91 zt91Var8 = zt91.f286105i;
                yt91 yt91VarM50626j8 = ihf1.m50626j();
                yt91VarM50626j8.f276054h = "music";
                yt91VarM50626j8.f276047a = "mobile-comments-interactivity-reply-limit-reached-sheet";
                yt91VarM50626j8.f276052f = "2.0.0";
                yt91VarM50626j8.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j8.m94607a();
                break;
            case 15:
                st91 st91Var3 = st91.f213865b;
                zt91 zt91Var9 = zt91.f286105i;
                yt91 yt91VarM50626j9 = ihf1.m50626j();
                yt91VarM50626j9.f276054h = "music";
                yt91VarM50626j9.f276047a = "mobile-disable-personalized-recommendations-dialog";
                yt91VarM50626j9.f276052f = "1.1.0";
                yt91VarM50626j9.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j9.m94607a();
                break;
            case 16:
                st91 st91Var4 = st91.f213865b;
                zt91 zt91Var10 = zt91.f286105i;
                yt91 yt91VarM50626j10 = ihf1.m50626j();
                yt91VarM50626j10.f276054h = "music";
                yt91VarM50626j10.f276047a = "mobile-dj-interactivity-page";
                yt91VarM50626j10.f276052f = "2.0.0";
                yt91VarM50626j10.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j10.m94607a();
                break;
            case 17:
                st91 st91Var5 = st91.f213865b;
                zt91 zt91Var11 = zt91.f286105i;
                yt91 yt91VarM50626j11 = ihf1.m50626j();
                yt91VarM50626j11.f276054h = "music";
                yt91VarM50626j11.f276047a = "mobile-enable-personalized-recommendations-upsell-dialog";
                yt91VarM50626j11.f276052f = "1.0.0";
                yt91VarM50626j11.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j11.m94607a();
                break;
            case 19:
                zt91 zt91Var12 = zt91.f286105i;
                yt91 yt91VarM50626j12 = ihf1.m50626j();
                yt91VarM50626j12.f276054h = "music";
                yt91VarM50626j12.f276047a = "mobile-gen-alpha-connect-disabled-connect-bluetooth-dialog";
                yt91VarM50626j12.f276052f = "2.0.0";
                yt91VarM50626j12.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j12.m94607a();
                break;
            case 20:
                zt91 zt91Var13 = zt91.f286105i;
                yt91 yt91VarM50626j13 = ihf1.m50626j();
                yt91VarM50626j13.f276054h = "music";
                yt91VarM50626j13.f276047a = "mobile-gen-alpha-connect-disabled-switch-listening-device-dialog";
                yt91VarM50626j13.f276052f = "2.0.0";
                yt91VarM50626j13.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j13.m94607a();
                break;
            case 22:
                st91 st91Var6 = st91.f213865b;
                zt91 zt91Var14 = zt91.f286105i;
                yt91 yt91VarM50626j14 = ihf1.m50626j();
                yt91VarM50626j14.f276054h = "music";
                yt91VarM50626j14.f276047a = "mobile-gen-alpha-parental-request-outdated-app-version-dialog";
                yt91VarM50626j14.f276052f = "1.0.0";
                yt91VarM50626j14.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j14.m94607a();
                break;
            case 24:
                st91 st91Var7 = st91.f213865b;
                zt91 zt91Var15 = zt91.f286105i;
                yt91 yt91VarM50626j15 = ihf1.m50626j();
                yt91VarM50626j15.f276054h = "music";
                yt91VarM50626j15.f276047a = "mobile-notification-preferences-permissions-inline-card";
                yt91VarM50626j15.f276052f = "1.0.1";
                yt91VarM50626j15.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j15.m94607a();
                break;
            case 25:
                st91 st91Var8 = st91.f213865b;
                zt91 zt91Var16 = zt91.f286105i;
                yt91 yt91VarM50626j16 = ihf1.m50626j();
                yt91VarM50626j16.f276054h = "music";
                yt91VarM50626j16.f276047a = "mobile-on-demand-trial-overview";
                yt91VarM50626j16.f276052f = "1.0.0";
                yt91VarM50626j16.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j16.m94607a();
                break;
            case 28:
                st91 st91Var9 = st91.f213865b;
                zt91 zt91Var17 = zt91.f286105i;
                yt91 yt91VarM50626j17 = ihf1.m50626j();
                yt91VarM50626j17.f276054h = "music";
                yt91VarM50626j17.f276047a = "mobile-sleep-timer-nudge";
                yt91VarM50626j17.f276052f = "2.0.0";
                yt91VarM50626j17.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j17.m94607a();
                break;
            case 29:
                st91 st91Var10 = st91.f213865b;
                zt91 zt91Var18 = zt91.f286105i;
                yt91 yt91VarM50626j18 = ihf1.m50626j();
                yt91VarM50626j18.f276054h = "music";
                yt91VarM50626j18.f276047a = "mobile-sts-delete-dialog";
                yt91VarM50626j18.f276052f = "1.0.0";
                yt91VarM50626j18.f276053g = "20.0.5";
                this.f25561b = yt91VarM50626j18.m94607a();
                break;
        }
    }

    public bbg0(int i, String str) {
        String str2;
        this.f25560a = 21;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-gen-alpha-entity-blocking-dialog";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str2 = "plan_manager";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "young_listener";
        }
        yt91VarM50626j.f276048b = str2;
        yt91VarM50626j.f276050d = str;
        this.f25561b = yt91VarM50626j.m94607a();
    }

    public bbg0(int i, String str, String str2) {
        String str3;
        this.f25560a = 26;
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-save-for-later-intent-modal";
        yt91VarM50626j.f276052f = "4.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        switch (i) {
            case 1:
                str3 = "album";
                break;
            case 2:
                str3 = "artist";
                break;
            case 3:
                str3 = "audiobook";
                break;
            case 4:
                str3 = "episode";
                break;
            case 5:
                str3 = "playlist";
                break;
            case 6:
                str3 = "podcast";
                break;
            case 7:
                str3 = "track";
                break;
            default:
                throw null;
        }
        yt91VarM50626j.f276048b = str3;
        yt91VarM50626j.f276051e = str;
        yt91VarM50626j.f276050d = str2;
        this.f25561b = yt91VarM50626j.m94607a();
    }

    public bbg0(String str, String str2, int i) {
        this.f25560a = i;
        switch (i) {
            case 4:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-blend-track-attribution-view";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = str;
                yt91VarM50626j.f276050d = str2;
                this.f25561b = yt91VarM50626j.m94607a();
                break;
            default:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-app-icon-settings";
                yt91VarM50626j2.f276052f = "1.1.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276048b = str;
                yt91VarM50626j2.f276050d = str2;
                this.f25561b = yt91VarM50626j2.m94607a();
                break;
        }
    }

    public bbg0(UUID uuid, int i) {
        this.f25560a = i;
        switch (i) {
            case 10:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-checkout-spotify";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = uuid.toString();
                this.f25561b = yt91VarM50626j.m94607a();
                break;
            case 11:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-checkout-uc-choice-screen";
                yt91VarM50626j2.f276052f = "2.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276048b = uuid.toString();
                this.f25561b = yt91VarM50626j2.m94607a();
                break;
            default:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-checkout-address";
                yt91VarM50626j3.f276052f = "2.1.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276048b = uuid.toString();
                this.f25561b = yt91VarM50626j3.m94607a();
                break;
        }
    }

    public bbg0(String str, String str2, st91 st91Var) {
        this.f25560a = 23;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-notification-center";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276050d = str2;
        this.f25561b = yt91VarM50626j.m94607a();
    }
}
