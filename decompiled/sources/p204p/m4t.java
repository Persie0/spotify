package p204p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: classes10.dex */
public final class m4t implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u5t f140020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SingleSubject f140021c;

    public /* synthetic */ m4t(SingleSubject singleSubject, u5t u5tVar, int i) {
        this.f140019a = i;
        this.f140021c = singleSubject;
        this.f140020b = u5tVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f140019a) {
            case 0:
                u5t u5tVar = this.f140020b;
                kv91 kv91Var = u5tVar.f227105a;
                xug0 xug0Var = u5tVar.f227106b;
                xug0Var.getClass();
                yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("camera_permission_denied_dialog", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("go_to_settings", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                String str = kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                this.f140021c.onSuccess(p4t.f174006a);
                break;
            case 1:
                u5t u5tVar2 = this.f140020b;
                kv91 kv91Var2 = u5tVar2.f227105a;
                xug0 xug0Var2 = u5tVar2.f227106b;
                xug0Var2.getClass();
                yt91 yt91VarM96903c3 = xug0Var2.f266109b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("camera_permission_denied_dialog", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("cancel", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                String str2 = kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                this.f140021c.onSuccess(o4t.f161751a);
                break;
            case 2:
                this.f140021c.onSuccess(v4t.f237238a);
                u5t u5tVar3 = this.f140020b;
                kv91 kv91Var3 = u5tVar3.f227105a;
                xug0 xug0Var3 = u5tVar3.f227106b;
                xug0Var3.getClass();
                yt91 yt91VarM96903c5 = xug0Var3.f266109b.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("change_photo_dialog", null, null, null, null));
                yt91VarM96903c5.f276056j = false;
                yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("choose_photo_button", null, null, null, null));
                yt91VarM96903c6.f276056j = false;
                String str3 = kv91Var3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c6.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                break;
            case 3:
                this.f140021c.onSuccess(n5t.f150614a);
                u5t u5tVar4 = this.f140020b;
                kv91 kv91Var4 = u5tVar4.f227105a;
                xug0 xug0Var4 = u5tVar4.f227106b;
                xug0Var4.getClass();
                yt91 yt91VarM96903c7 = xug0Var4.f266109b.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("change_photo_dialog", null, null, null, null));
                yt91VarM96903c7.f276056j = false;
                yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                yt91VarM96903c8.f276055i.add(new bu91("take_photo_button", null, null, null, null));
                yt91VarM96903c8.f276056j = false;
                String str4 = kv91Var4.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c8.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                break;
            case 4:
                this.f140021c.onSuccess(j5t.f109093a);
                u5t u5tVar5 = this.f140020b;
                kv91 kv91Var5 = u5tVar5.f227105a;
                xug0 xug0Var5 = u5tVar5.f227106b;
                xug0Var5.getClass();
                yt91 yt91VarM96903c9 = xug0Var5.f266109b.m96903c();
                yt91VarM96903c9.f276055i.add(new bu91("change_photo_dialog", null, null, null, null));
                yt91VarM96903c9.f276056j = false;
                yt91 yt91VarM96903c10 = yt91VarM96903c9.m94607a().m96903c();
                yt91VarM96903c10.f276055i.add(new bu91("remove_current_photo_button", null, null, null, null));
                yt91VarM96903c10.f276056j = false;
                String str5 = kv91Var5.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c10.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                break;
            case 5:
                u5t u5tVar6 = this.f140020b;
                kv91 kv91Var6 = u5tVar6.f227105a;
                xug0 xug0Var6 = u5tVar6.f227106b;
                xug0Var6.getClass();
                yt91 yt91VarM96903c11 = xug0Var6.f266109b.m96903c();
                yt91VarM96903c11.f276055i.add(new bu91("confirm_discard_dialog", null, null, null, null));
                yt91VarM96903c11.f276056j = false;
                yt91 yt91VarM96903c12 = yt91VarM96903c11.m94607a().m96903c();
                yt91VarM96903c12.f276055i.add(new bu91("keep_editing_button", null, null, null, null));
                yt91VarM96903c12.f276056j = false;
                String str6 = kv91Var6.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c12.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                this.f140021c.onSuccess(w4t.f247879a);
                break;
            default:
                u5t u5tVar7 = this.f140020b;
                kv91 kv91Var7 = u5tVar7.f227105a;
                xug0 xug0Var7 = u5tVar7.f227106b;
                xug0Var7.getClass();
                yt91 yt91VarM96903c13 = xug0Var7.f266109b.m96903c();
                yt91VarM96903c13.f276055i.add(new bu91("confirm_discard_dialog", null, null, null, null));
                yt91VarM96903c13.f276056j = false;
                yt91 yt91VarM96903c14 = yt91VarM96903c13.m94607a().m96903c();
                yt91VarM96903c14.f276055i.add(new bu91("discard_button", null, null, null, null));
                yt91VarM96903c14.f276056j = false;
                String str7 = kv91Var7.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c14.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                this.f140021c.onSuccess(y4t.f269219a);
                break;
        }
    }

    public /* synthetic */ m4t(u5t u5tVar, SingleSubject singleSubject, int i) {
        this.f140019a = i;
        this.f140020b = u5tVar;
        this.f140021c = singleSubject;
    }
}
