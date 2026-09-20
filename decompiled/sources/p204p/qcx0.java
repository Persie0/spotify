package p204p;

import android.app.Activity;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: classes7.dex */
public final class qcx0 {

    /* JADX INFO: renamed from: a */
    public final Activity f187425a;

    /* JADX INFO: renamed from: b */
    public final jh10 f187426b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f187427c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f187428d;

    /* JADX INFO: renamed from: e */
    public final luk f187429e;

    public qcx0(Activity activity, jh10 jh10Var, Scheduler scheduler, Scheduler scheduler2, luk lukVar) {
        this.f187425a = activity;
        this.f187426b = jh10Var;
        this.f187427c = scheduler;
        this.f187428d = scheduler2;
        this.f187429e = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public static final void m72571a(int i, SingleSubject singleSubject, gh00 gh00Var, qcx0 qcx0Var) {
        Activity activity = qcx0Var.f187425a;
        String string = activity.getString(R.string.playlist_make_private_try_again_dialog_title);
        String string2 = activity.getString(i);
        String string3 = activity.getString(R.string.playlist_make_private_try_again_dialog_button_positive);
        String string4 = activity.getString(R.string.playlist_make_private_try_again_dialog_button_negative);
        ih10 ih10VarM31832a0 = c95.m31832a0(qcx0Var.f187426b.f112309a, string, string2);
        pcx0 pcx0Var = new pcx0(0, singleSubject, gh00Var, qcx0Var);
        ih10VarM31832a0.f102113a = string3;
        ih10VarM31832a0.f102115c = pcx0Var;
        pcx0 pcx0Var2 = new pcx0(1, singleSubject, gh00Var, qcx0Var);
        ih10VarM31832a0.f102114b = string4;
        ih10VarM31832a0.f102116d = pcx0Var2;
        ih10VarM31832a0.f102118f = new fic(singleSubject, 10);
        ih10VarM31832a0.m50574b().m58942b();
    }

    /* JADX INFO: renamed from: b */
    public final Object m72572b(vpc vpcVar, dcq0 dcq0Var, ljw0 ljw0Var) {
        return m72573c(R.string.playlist_participants_try_again_dialog_body_remove_user, vpcVar, dcq0Var, pwv0.f182118N0, ljw0Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: c */
    public final Object m72573c(int i, gh00 gh00Var, gh00 gh00Var2, eh00 eh00Var, ibk ibkVar) {
        ocx0 ocx0Var;
        eh00 eh00Var2;
        gh00 gh00Var3;
        Object obj;
        gh00 gh00Var4;
        int i2;
        eh00 eh00Var3;
        SingleSubject singleSubject;
        int i3;
        gh00 gh00Var5;
        gh00 gh00Var6;
        eh00 eh00Var4;
        Object objM72573c;
        if (ibkVar instanceof ocx0) {
            ocx0Var = (ocx0) ibkVar;
            int i4 = ocx0Var.f164014h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ocx0Var.f164014h = i4 - Integer.MIN_VALUE;
            } else {
                ocx0Var = new ocx0(this, ibkVar);
            }
        } else {
            ocx0Var = new ocx0(this, ibkVar);
        }
        ocx0 ocx0Var2 = ocx0Var;
        Object objM96567o = ocx0Var2.f164012f;
        int i5 = ocx0Var2.f164014h;
        Object obj2 = yuk.f276404a;
        if (i5 == 0) {
            bga.m29073P(objM96567o);
            ocx0Var2.f164008b = gh00Var;
            ocx0Var2.f164009c = gh00Var2;
            eh00Var2 = eh00Var;
            ocx0Var2.f164010d = eh00Var2;
            ocx0Var2.f164007a = i;
            ocx0Var2.f164014h = 1;
            Object objInvoke = gh00Var.invoke(ocx0Var2);
            if (objInvoke != obj2) {
                gh00Var3 = gh00Var;
                obj = objInvoke;
                gh00Var4 = gh00Var2;
                i2 = i;
            }
            return obj2;
        }
        if (i5 == 1) {
            int i6 = ocx0Var2.f164007a;
            eh00Var2 = ocx0Var2.f164010d;
            gh00Var4 = ocx0Var2.f164009c;
            gh00 gh00Var7 = ocx0Var2.f164008b;
            bga.m29073P(objM96567o);
            i2 = i6;
            obj = objM96567o;
            gh00Var3 = gh00Var7;
        } else {
            if (i5 == 2) {
                i3 = ocx0Var2.f164007a;
                singleSubject = ocx0Var2.f164011e;
                eh00 eh00Var5 = ocx0Var2.f164010d;
                gh00 gh00Var8 = ocx0Var2.f164009c;
                gh00 gh00Var9 = ocx0Var2.f164008b;
                bga.m29073P(objM96567o);
                eh00Var3 = eh00Var5;
                gh00Var4 = gh00Var8;
                gh00Var5 = gh00Var9;
                ocx0Var2.f164008b = gh00Var5;
                ocx0Var2.f164009c = gh00Var4;
                ocx0Var2.f164010d = eh00Var3;
                ocx0Var2.f164011e = null;
                ocx0Var2.f164007a = i3;
                ocx0Var2.f164014h = 3;
                objM96567o = zn91.m96567o(singleSubject, ocx0Var2);
                if (objM96567o != obj2) {
                    gh00Var6 = gh00Var4;
                    eh00Var4 = eh00Var3;
                }
                return obj2;
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
                return objM96567o;
            }
            i3 = ocx0Var2.f164007a;
            eh00 eh00Var6 = ocx0Var2.f164010d;
            gh00 gh00Var10 = ocx0Var2.f164009c;
            gh00Var5 = ocx0Var2.f164008b;
            bga.m29073P(objM96567o);
            eh00Var4 = eh00Var6;
            gh00Var6 = gh00Var10;
        }
        if (((mcx0) objM96567o) == mcx0.f142262a) {
            return null;
        }
        ocx0Var2.f164008b = null;
        ocx0Var2.f164009c = null;
        ocx0Var2.f164010d = null;
        ocx0Var2.f164011e = null;
        ocx0Var2.f164007a = i3;
        ocx0Var2.f164014h = 4;
        objM72573c = m72573c(i3, gh00Var5, gh00Var6, eh00Var4, ocx0Var2);
        if (objM72573c != obj2) {
            return obj2;
        }
        return objM72573c;
        eh00Var3 = eh00Var2;
        if (obj != null) {
            return obj;
        }
        singleSubject = (SingleSubject) eh00Var3.invoke();
        ilw0 ilw0Var = new ilw0(this, i2, singleSubject, gh00Var4, (fbk) null);
        ocx0Var2.f164008b = gh00Var3;
        ocx0Var2.f164009c = gh00Var4;
        ocx0Var2.f164010d = eh00Var3;
        ocx0Var2.f164011e = singleSubject;
        ocx0Var2.f164007a = i2;
        ocx0Var2.f164014h = 2;
        if (x0h1.m89557A(this.f187429e, ilw0Var, ocx0Var2) != obj2) {
            i3 = i2;
            gh00Var5 = gh00Var3;
            ocx0Var2.f164008b = gh00Var5;
            ocx0Var2.f164009c = gh00Var4;
            ocx0Var2.f164010d = eh00Var3;
            ocx0Var2.f164011e = null;
            ocx0Var2.f164007a = i3;
            ocx0Var2.f164014h = 3;
            objM96567o = zn91.m96567o(singleSubject, ocx0Var2);
            if (objM96567o != obj2) {
                gh00Var6 = gh00Var4;
                eh00Var4 = eh00Var3;
                if (((mcx0) objM96567o) == mcx0.f142262a) {
                    return null;
                }
                ocx0Var2.f164008b = null;
                ocx0Var2.f164009c = null;
                ocx0Var2.f164010d = null;
                ocx0Var2.f164011e = null;
                ocx0Var2.f164007a = i3;
                ocx0Var2.f164014h = 4;
                objM72573c = m72573c(i3, gh00Var5, gh00Var6, eh00Var4, ocx0Var2);
                if (objM72573c != obj2) {
                    return objM72573c;
                }
            }
        }
        return obj2;
    }
}
