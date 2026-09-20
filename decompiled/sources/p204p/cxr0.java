package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class cxr0 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dxr0 f43087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxr0(dxr0 dxr0Var, int i) {
        super(4);
        this.f43086a = i;
        this.f43087b = dxr0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        av91 av91Var;
        switch (this.f43086a) {
            case 0:
                ((Number) obj3).intValue();
                return new u6h0(this.f43087b.f54080c);
            default:
                bxr0 bxr0Var = (bxr0) obj2;
                dxr0 dxr0Var = this.f43087b;
                String str = dxr0Var.f54081d;
                String str2 = dxr0Var.f54080c;
                zt91 zt91Var = ((u6h0) obj).f227350a;
                int iOrdinal = ((axr0) obj4).f20987a.ordinal();
                nau nauVar = nau.f152117a;
                switch (iOrdinal) {
                    case 0:
                        yt91 yt91VarM96903c = zt91Var.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("toolbar", null, null, null, null));
                        yt91VarM96903c.f276056j = false;
                        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                        yt91VarM96903c2.f276055i.add(new bu91("back_button", null, null, null, null));
                        yt91VarM96903c2.f276056j = false;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
                        break;
                    case 1:
                        yt91 yt91VarM96903c3 = zt91Var.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c3.f276056j = false;
                        yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                        yt91VarM96903c4.f276055i.add(new bu91("edit_button", null, null, null, null));
                        yt91VarM96903c4.f276056j = false;
                        zt91 zt91VarM94607a = yt91VarM96903c4.m94607a();
                        dv91 dv91Var = new dv91("hit", 1);
                        String string = str != null ? str.toString() : null;
                        av91Var = new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
                        break;
                    case 2:
                        yt91 yt91VarM96903c5 = zt91Var.m96903c();
                        yt91VarM96903c5.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c5.f276056j = false;
                        yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                        yt91VarM96903c6.f276055i.add(new bu91("settings_button", null, null, null, null));
                        yt91VarM96903c6.f276056j = false;
                        zt91 zt91VarM94607a2 = yt91VarM96903c6.m94607a();
                        String str3 = dxr0Var.f54086i;
                        dv91 dv91Var2 = new dv91("hit", 1);
                        String string2 = str3 != null ? str3.toString() : null;
                        av91Var = new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
                        break;
                    case 3:
                        yt91 yt91VarM96903c7 = zt91Var.m96903c();
                        yt91VarM96903c7.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c7.f276056j = false;
                        yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                        yt91VarM96903c8.f276055i.add(new bu91("profile_picture", null, null, null, null));
                        yt91VarM96903c8.f276056j = false;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c8.m94607a(), st91.f213865b, System.currentTimeMillis());
                        break;
                    case 4:
                        yt91 yt91VarM96903c9 = zt91Var.m96903c();
                        yt91VarM96903c9.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c9.f276056j = false;
                        yt91 yt91VarM96903c10 = yt91VarM96903c9.m94607a().m96903c();
                        yt91VarM96903c10.f276055i.add(new bu91("profile_name", null, null, null, null));
                        yt91VarM96903c10.f276056j = false;
                        zt91 zt91VarM94607a3 = yt91VarM96903c10.m94607a();
                        dv91 dv91Var3 = new dv91("hit", 1);
                        String string3 = str != null ? str.toString() : null;
                        av91Var = new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3 != null ? string3 : "")), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis());
                        break;
                    case 5:
                        yt91 yt91VarM96903c11 = zt91Var.m96903c();
                        yt91VarM96903c11.f276055i.add(new bu91("button_row", null, null, null, null));
                        yt91VarM96903c11.f276056j = false;
                        yt91 yt91VarM96903c12 = yt91VarM96903c11.m94607a().m96903c();
                        yt91VarM96903c12.f276055i.add(new bu91("following_button", null, null, null, null));
                        yt91VarM96903c12.f276056j = false;
                        zt91 zt91VarM94607a4 = yt91VarM96903c12.m94607a();
                        String str4 = dxr0Var.f54083f;
                        dv91 dv91Var4 = new dv91("hit", 1);
                        String string4 = str4 != null ? str4.toString() : null;
                        av91Var = new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4 != null ? string4 : "")), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis());
                        break;
                    case 6:
                        yt91 yt91VarM96903c13 = zt91Var.m96903c();
                        yt91VarM96903c13.f276055i.add(new bu91("button_row", null, null, null, null));
                        yt91VarM96903c13.f276056j = false;
                        yt91 yt91VarM96903c14 = yt91VarM96903c13.m94607a().m96903c();
                        yt91VarM96903c14.f276055i.add(new bu91("followers_button", null, null, null, null));
                        yt91VarM96903c14.f276056j = false;
                        zt91 zt91VarM94607a5 = yt91VarM96903c14.m94607a();
                        String str5 = dxr0Var.f54082e;
                        dv91 dv91Var5 = new dv91("hit", 1);
                        String string5 = str5 != null ? str5.toString() : null;
                        av91Var = new av91("", "", dv91Var5, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string5 != null ? string5 : "")), zt91VarM94607a5, st91.f213865b, System.currentTimeMillis());
                        break;
                    case 7:
                        ro80 ro80Var = bxr0Var.f31970a.f287065f;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = ro80Var.listIterator(0);
                        while (true) {
                            qo80 qo80Var = (qo80) listIterator;
                            if (!qo80Var.hasNext()) {
                                uwr0 uwr0Var = (uwr0) g6f.m43745s0(arrayList);
                                if (uwr0Var != null && uwr0Var.f234727a) {
                                    yt91 yt91VarM96903c15 = zt91Var.m96903c();
                                    yt91VarM96903c15.f276055i.add(new bu91("header", null, null, null, null));
                                    yt91VarM96903c15.f276056j = false;
                                    yt91 yt91VarM96903c16 = yt91VarM96903c15.m94607a().m96903c();
                                    yt91VarM96903c16.f276055i.add(new bu91("follow_button", null, null, null, null));
                                    yt91VarM96903c16.f276056j = false;
                                    zt91 zt91VarM94607a6 = yt91VarM96903c16.m94607a();
                                    dv91 dv91Var6 = new dv91("hit", 1);
                                    String string6 = str2 != null ? str2.toString() : null;
                                    av91Var = new av91("", "", dv91Var6, new bv91("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", string6 != null ? string6 : "")), zt91VarM94607a6, st91.f213865b, System.currentTimeMillis());
                                } else if (uwr0Var != null && uwr0Var.f234728b) {
                                    yt91 yt91VarM96903c17 = zt91Var.m96903c();
                                    yt91VarM96903c17.f276055i.add(new bu91("header", null, null, null, null));
                                    yt91VarM96903c17.f276056j = false;
                                    yt91 yt91VarM96903c18 = yt91VarM96903c17.m94607a().m96903c();
                                    yt91VarM96903c18.f276055i.add(new bu91("follow_back_button", null, null, null, null));
                                    yt91VarM96903c18.f276056j = false;
                                    zt91 zt91VarM94607a7 = yt91VarM96903c18.m94607a();
                                    dv91 dv91Var7 = new dv91("hit", 1);
                                    String string7 = str2 != null ? str2.toString() : null;
                                    av91Var = new av91("", "", dv91Var7, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string7 != null ? string7 : "")), zt91VarM94607a7, st91.f213865b, System.currentTimeMillis());
                                } else {
                                    yt91 yt91VarM96903c19 = zt91Var.m96903c();
                                    yt91VarM96903c19.f276055i.add(new bu91("header", null, null, null, null));
                                    yt91VarM96903c19.f276056j = false;
                                    yt91 yt91VarM96903c20 = yt91VarM96903c19.m94607a().m96903c();
                                    yt91VarM96903c20.f276055i.add(new bu91("follow_button", null, null, null, null));
                                    yt91VarM96903c20.f276056j = false;
                                    zt91 zt91VarM94607a8 = yt91VarM96903c20.m94607a();
                                    dv91 dv91Var8 = new dv91("hit", 1);
                                    String string8 = str2 != null ? str2.toString() : null;
                                    av91Var = new av91("", "", dv91Var8, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string8 != null ? string8 : "")), zt91VarM94607a8, st91.f213865b, System.currentTimeMillis());
                                }
                                break;
                            } else {
                                Object next = qo80Var.next();
                                if (next instanceof uwr0) {
                                    arrayList.add(next);
                                }
                            }
                        }
                        break;
                    case 8:
                        String str6 = bxr0Var.f31974e;
                        if (str6 == null) {
                            str6 = dxr0Var.f54087t;
                        }
                        String str7 = str6;
                        yt91 yt91VarM96903c21 = zt91Var.m96903c();
                        yt91VarM96903c21.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c21.f276056j = false;
                        yt91 yt91VarM96903c22 = yt91VarM96903c21.m94607a().m96903c();
                        yt91VarM96903c22.f276055i.add(new bu91("message_button", null, null, str7, null));
                        yt91VarM96903c22.f276056j = true;
                        zt91 zt91VarM94607a9 = yt91VarM96903c22.m94607a();
                        dv91 dv91Var9 = new dv91("hit", 1);
                        String string9 = str7 != null ? str7.toString() : null;
                        av91Var = new av91("", "", dv91Var9, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string9 != null ? string9 : "")), zt91VarM94607a9, st91.f213865b, System.currentTimeMillis());
                        break;
                    case 9:
                        yt91 yt91VarM96903c23 = zt91Var.m96903c();
                        yt91VarM96903c23.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c23.f276056j = false;
                        yt91 yt91VarM96903c24 = yt91VarM96903c23.m94607a().m96903c();
                        yt91VarM96903c24.f276055i.add(new bu91("add_friend_button", null, null, null, "not_invited"));
                        yt91VarM96903c24.f276056j = true;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c24.m94607a(), st91.f213865b, System.currentTimeMillis());
                        break;
                    case 10:
                        yt91 yt91VarM96903c25 = zt91Var.m96903c();
                        yt91VarM96903c25.f276055i.add(new bu91("button_row", null, null, null, null));
                        yt91VarM96903c25.f276056j = false;
                        yt91 yt91VarM96903c26 = yt91VarM96903c25.m94607a().m96903c();
                        yt91VarM96903c26.f276055i.add(new bu91("friends_button", null, null, null, null));
                        yt91VarM96903c26.f276056j = false;
                        zt91 zt91VarM94607a10 = yt91VarM96903c26.m94607a();
                        String str8 = dxr0Var.f54084g;
                        dv91 dv91Var10 = new dv91("hit", 1);
                        String string10 = str8 != null ? str8.toString() : null;
                        av91Var = new av91("", "", dv91Var10, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string10 != null ? string10 : "")), zt91VarM94607a10, st91.f213865b, System.currentTimeMillis());
                        break;
                    case 11:
                    case 14:
                        return null;
                    case 12:
                        yt91 yt91VarM96903c27 = zt91Var.m96903c();
                        yt91VarM96903c27.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c27.f276056j = false;
                        yt91 yt91VarM96903c28 = yt91VarM96903c27.m94607a().m96903c();
                        yt91VarM96903c28.f276055i.add(new bu91("biography_text", null, null, null, null));
                        yt91VarM96903c28.f276056j = false;
                        zt91 zt91VarM94607a11 = yt91VarM96903c28.m94607a();
                        String str9 = dxr0Var.f54085h;
                        dv91 dv91Var11 = new dv91("hit", 1);
                        String string11 = str9 != null ? str9.toString() : null;
                        av91Var = new av91("", "", dv91Var11, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string11 != null ? string11 : "")), zt91VarM94607a11, st91.f213865b, System.currentTimeMillis());
                        break;
                    case 13:
                        yt91 yt91VarM96903c29 = zt91Var.m96903c();
                        yt91VarM96903c29.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c29.f276056j = false;
                        yt91 yt91VarM96903c30 = yt91VarM96903c29.m94607a().m96903c();
                        yt91VarM96903c30.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                        yt91VarM96903c30.f276056j = false;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c30.m94607a(), st91.f213865b, System.currentTimeMillis());
                        break;
                    case 15:
                        yt91 yt91VarM96903c31 = zt91Var.m96903c();
                        yt91VarM96903c31.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c31.f276056j = false;
                        yt91 yt91VarM96903c32 = yt91VarM96903c31.m94607a().m96903c();
                        yt91VarM96903c32.f276055i.add(new bu91("biography_text", null, null, null, null));
                        yt91VarM96903c32.f276056j = false;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c32.m94607a(), st91.f213865b, System.currentTimeMillis());
                        break;
                    case 16:
                        yt91 yt91VarM96903c33 = zt91Var.m96903c();
                        yt91VarM96903c33.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c33.f276056j = false;
                        yt91 yt91VarM96903c34 = yt91VarM96903c33.m94607a().m96903c();
                        yt91VarM96903c34.f276055i.add(new bu91("biography_text", null, null, null, null));
                        yt91VarM96903c34.f276056j = false;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c34.m94607a(), st91.f213865b, System.currentTimeMillis());
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return av91Var;
        }
    }
}
