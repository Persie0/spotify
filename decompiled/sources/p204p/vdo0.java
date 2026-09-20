package p204p;

import android.app.RemoteAction;
import android.content.Context;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.p002ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class vdo0 implements qdo0 {

    /* JADX INFO: renamed from: a */
    public final juk f240455a;

    /* JADX INFO: renamed from: b */
    public final Context f240456b;

    /* JADX INFO: renamed from: c */
    public final wkz0 f240457c;

    /* JADX INFO: renamed from: d */
    public final LocaleList f240458d;

    /* JADX INFO: renamed from: f */
    public TextClassifier f240460f;

    /* JADX INFO: renamed from: e */
    public final lsi0 f240459e = msi0.m62770a();

    /* JADX INFO: renamed from: g */
    public final yum0 f240461g = sam.m77645B(null);

    /* JADX INFO: renamed from: h */
    public final Object f240462h = new Object();

    public vdo0(juk jukVar, Context context, wkz0 wkz0Var, LocaleList localeList) {
        this.f240455a = jukVar;
        this.f240456b = context;
        this.f240457c = wkz0Var;
        this.f240458d = localeList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    public static final Object m85261a(vdo0 vdo0Var, CharSequence charSequence, long j, TextClassifier textClassifier, ibk ibkVar) {
        rdo0 rdo0Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        lsi0 lsi0Var;
        Object obj;
        TextClassification textClassificationClassifyText;
        long j3;
        CharSequence charSequence3;
        yum0 yum0Var = vdo0Var.f240461g;
        lsi0 lsi0Var2 = vdo0Var.f240459e;
        if (ibkVar instanceof rdo0) {
            rdo0Var = (rdo0) ibkVar;
            int i = rdo0Var.f198185g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rdo0Var.f198185g = i - Integer.MIN_VALUE;
            } else {
                rdo0Var = new rdo0(vdo0Var, ibkVar);
            }
        } else {
            rdo0Var = new rdo0(vdo0Var, ibkVar);
        }
        Object obj2 = rdo0Var.f198183e;
        int i2 = rdo0Var.f198185g;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j2 = rdo0Var.f198182d;
                    lsi0Var = rdo0Var.f198181c;
                    textClassifier2 = (TextClassifier) rdo0Var.f198180b;
                    charSequence2 = rdo0Var.f198179a;
                    bga.m29073P(obj2);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = rdo0Var.f198182d;
                    lsi0Var2 = rdo0Var.f198181c;
                    textClassificationClassifyText = (TextClassification) rdo0Var.f198180b;
                    charSequence3 = rdo0Var.f198179a;
                    bga.m29073P(obj2);
                }
                try {
                    yum0Var.setValue(new e271(charSequence3, j3, textClassificationClassifyText));
                    return w2a1Var;
                } finally {
                    lsi0Var2.mo54249c(null);
                }
            }
            bga.m29073P(obj2);
            rdo0Var.f198179a = charSequence;
            rdo0Var.f198180b = textClassifier;
            rdo0Var.f198181c = lsi0Var2;
            j2 = j;
            rdo0Var.f198182d = j2;
            rdo0Var.f198185g = 1;
            if (lsi0Var2.mo54248a(rdo0Var) == yukVar) {
                return yukVar;
            }
            charSequence2 = charSequence;
            textClassifier2 = textClassifier;
            lsi0Var = lsi0Var2;
            e271 e271Var = (e271) yum0Var.getValue();
            if (e271Var != null) {
                wy41 wy41Var = xdo0.f260513a;
                obj = null;
                if (ic71.m50235c(j2, e271Var.f55384b) && wj50.m88271j(charSequence2, e271Var.f55383a)) {
                    lsi0Var.mo54249c(null);
                    return w2a1Var;
                }
            } else {
                obj = null;
            }
            lsi0Var.mo54249c(obj);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, ic71.m50239g(j2), ic71.m50238f(j2)).setDefaultLocales(vdo0Var.m85263c()).build());
            rdo0Var.f198179a = charSequence2;
            rdo0Var.f198180b = textClassificationClassifyText;
            rdo0Var.f198181c = lsi0Var2;
            rdo0Var.f198182d = j2;
            rdo0Var.f198185g = 2;
            if (lsi0Var2.mo54248a(rdo0Var) == yukVar) {
                return yukVar;
            }
            j3 = j2;
            charSequence3 = charSequence2;
            yum0Var.setValue(new e271(charSequence3, j3, textClassificationClassifyText));
            return w2a1Var;
        } catch (Throwable th) {
            lsi0Var.mo54249c(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m85262b(m471 m471Var, CharSequence charSequence, long j, gh00 gh00Var) {
        lsi0 lsi0Var = this.f240459e;
        TextClassification textClassification = null;
        if (lsi0Var.m59837g()) {
            e271 e271Var = (e271) this.f240461g.getValue();
            TextClassification textClassification2 = (e271Var != null && ic71.m50235c(j, e271Var.f55384b) && wj50.m88271j(charSequence, e271Var.f55383a)) ? e271Var.f55385c : null;
            lsi0Var.mo54249c(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            gh00Var.invoke(m471Var);
            return;
        }
        boolean zIsEmpty = textClassification.getActions().isEmpty();
        Object obj = this.f240462h;
        if (!zIsEmpty) {
            m471Var.f139858a.m53954a(new d571(obj, textClassification, 0));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            m471Var.f139858a.m53954a(new d571(obj, textClassification, -1));
        }
        gh00Var.invoke(m471Var);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                m471Var.f139858a.m53954a(new d571(obj, textClassification, i));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final android.os.LocaleList m85263c() {
        LocaleList localeList = this.f240458d;
        if (localeList == null) {
            return new android.os.LocaleList(cdo0.f36923a.m67495o().m304a().f90651a);
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(localeList, 10));
        Iterator it = localeList.f535a.iterator();
        while (it.hasNext()) {
            arrayList.add(((hfa0) it.next()).f90651a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    /* JADX INFO: renamed from: d */
    public final Object m85264d(CharSequence charSequence, long j, mb61 mb61Var) throws Throwable {
        Object objM89557A;
        int length = charSequence.length();
        w2a1 w2a1Var = w2a1.f247311a;
        if (length == 0 || ic71.m50236d(j)) {
            objM89557A = w2a1Var;
        } else {
            objM89557A = x0h1.m89557A(this.f240455a, new tdo0(this, new sdo0(j, charSequence, null, this), null), mb61Var);
        }
        return objM89557A == yuk.f276404a ? objM89557A : w2a1Var;
    }
}
