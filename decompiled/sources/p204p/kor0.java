package p204p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: classes9.dex */
public final class kor0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b1q f124903b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SingleSubject f124904c;

    public /* synthetic */ kor0(b1q b1qVar, SingleSubject singleSubject, int i) {
        this.f124902a = i;
        this.f124903b = b1qVar;
        this.f124904c = singleSubject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f124902a) {
            case 0:
                b1q b1qVar = this.f124903b;
                kv91 kv91Var = b1qVar.f22389a;
                xug0 xug0Var = b1qVar.f22391c;
                xug0Var.getClass();
                yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("profile_picture_step", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("change_photo_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("change_photo_dialog", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("choose_photo_button", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                String str = kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                this.f124904c.onSuccess(zor0.f284864a);
                break;
            case 1:
                b1q b1qVar2 = this.f124903b;
                kv91 kv91Var2 = b1qVar2.f22389a;
                xug0 xug0Var2 = b1qVar2.f22391c;
                xug0Var2.getClass();
                yt91 yt91VarM96903c5 = xug0Var2.f266109b.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("profile_picture_step", null, null, null, null));
                yt91VarM96903c5.f276056j = true;
                yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("change_photo_button", null, null, null, null));
                yt91VarM96903c6.f276056j = false;
                yt91 yt91VarM96903c7 = yt91VarM96903c6.m94607a().m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("change_photo_dialog", null, null, null, null));
                yt91VarM96903c7.f276056j = false;
                yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                yt91VarM96903c8.f276055i.add(new bu91("take_photo_button", null, null, null, null));
                yt91VarM96903c8.f276056j = false;
                String str2 = kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c8.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                this.f124904c.onSuccess(apr0.f18000a);
                break;
            case 2:
                b1q b1qVar3 = this.f124903b;
                kv91 kv91Var3 = b1qVar3.f22389a;
                xug0 xug0Var3 = b1qVar3.f22391c;
                xug0Var3.getClass();
                yt91 yt91VarM96903c9 = xug0Var3.f266109b.m96903c();
                yt91VarM96903c9.f276055i.add(new bu91("result_step", null, null, null, null));
                yt91VarM96903c9.f276056j = true;
                yt91 yt91VarM96903c10 = yt91VarM96903c9.m94607a().m96903c();
                yt91VarM96903c10.f276055i.add(new bu91("save_failed_dialog", null, null, null, null));
                yt91VarM96903c10.f276056j = true;
                yt91 yt91VarM96903c11 = yt91VarM96903c10.m94607a().m96903c();
                yt91VarM96903c11.f276055i.add(new bu91("retry_button", null, null, null, null));
                yt91VarM96903c11.f276056j = false;
                String str3 = kv91Var3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c11.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                this.f124904c.onSuccess(epr0.f61704a);
                break;
            default:
                b1q b1qVar4 = this.f124903b;
                kv91 kv91Var4 = b1qVar4.f22389a;
                xug0 xug0Var4 = b1qVar4.f22391c;
                xug0Var4.getClass();
                yt91 yt91VarM96903c12 = xug0Var4.f266109b.m96903c();
                yt91VarM96903c12.f276055i.add(new bu91("result_step", null, null, null, null));
                yt91VarM96903c12.f276056j = true;
                yt91 yt91VarM96903c13 = yt91VarM96903c12.m94607a().m96903c();
                yt91VarM96903c13.f276055i.add(new bu91("save_failed_dialog", null, null, null, null));
                yt91VarM96903c13.f276056j = true;
                yt91 yt91VarM96903c14 = yt91VarM96903c13.m94607a().m96903c();
                yt91VarM96903c14.f276055i.add(new bu91("cancel_button", null, null, null, null));
                yt91VarM96903c14.f276056j = false;
                String str4 = kv91Var4.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c14.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                this.f124904c.onSuccess(dpr0.f51706a);
                break;
        }
    }
}
