package p204p;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.car.app.C0023j;
import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class i8b implements j8b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99752a;

    /* JADX INFO: renamed from: b */
    public final Object f99753b;

    public /* synthetic */ i8b(Object obj, int i) {
        this.f99752a = i;
        this.f99753b = obj;
    }

    @Override // p204p.j8b
    /* JADX INFO: renamed from: a */
    public final CharSequence mo49944a(h8b h8bVar) {
        a7b a7bVar;
        switch (this.f99752a) {
            case 0:
                e8b e8bVar = (e8b) h8bVar;
                C0023j c0023j = (C0023j) ((er70) this.f99753b).get();
                int i = e8bVar.f57122a;
                String[] strArr = (String[]) e8bVar.f57123b.toArray(new String[0]);
                return c0023j.getString(i, Arrays.copyOf(strArr, strArr.length));
            default:
                g8b g8bVar = (g8b) h8bVar;
                String str = g8bVar.f77449b;
                Set<a321> set = g8bVar.f77448a;
                if (set.isEmpty()) {
                    return str;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (a321 a321Var : set) {
                    if (a321Var instanceof z221) {
                        ForegroundCarColorSpan foregroundCarColorSpanCreate = ForegroundCarColorSpan.create(t6b.f217516b.m36971a());
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) ((z221) a321Var).f278467a);
                        spannableStringBuilder.setSpan(foregroundCarColorSpanCreate, length, spannableStringBuilder.length(), 17);
                    } else {
                        if (!(a321Var instanceof y221)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y221 y221Var = (y221) a321Var;
                        if (y221Var.equals(x221.f257339b)) {
                            a7bVar = new a7b(Integer.valueOf(R.drawable.ic_explicit), null, t6b.f217525k.m36972b(), 10);
                        } else if (y221Var.equals(x221.f257338a)) {
                            a7bVar = new a7b(Integer.valueOf(R.drawable.encore_icon_download_16), null, t6b.f217516b.m36972b(), 10);
                        } else if (y221Var.equals(x221.f257340c)) {
                            a7bVar = new a7b(Integer.valueOf(R.drawable.encore_icon_enhance_badge_16), null, t6b.f217516b.m36972b(), 10);
                        } else if (y221Var.equals(x221.f257342e)) {
                            a7bVar = new a7b(Integer.valueOf(R.drawable.ic_new), null, t6b.f217516b.m36972b(), 10);
                        } else {
                            if (!y221Var.equals(x221.f257341d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a7bVar = new a7b(Integer.valueOf(R.drawable.encore_icon_help_circle_16), null, t6b.f217525k.m36972b(), 10);
                        }
                        CarIconSpan carIconSpanCreate = CarIconSpan.create(((k1x0) this.f99753b).mo52613a(a7bVar), 2);
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) ("{" + a321Var.getClass().getSimpleName() + "}"));
                        spannableStringBuilder.setSpan(carIconSpanCreate, length2, spannableStringBuilder.length(), 17);
                    }
                    spannableStringBuilder.append((CharSequence) " ");
                }
                spannableStringBuilder.append((CharSequence) str);
                return new SpannedString(spannableStringBuilder);
        }
    }
}
