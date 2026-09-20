package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class k0p implements ovf {

    /* JADX INFO: renamed from: a */
    public final Context f118129a;

    /* JADX INFO: renamed from: b */
    public final twy f118130b;

    /* JADX INFO: renamed from: c */
    public final g79 f118131c;

    public k0p(Context context) {
        this.f118129a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.benefit_list_card, (ViewGroup) null, false);
        int i = R.id.ao_badge;
        EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(viewInflate, R.id.ao_badge);
        if (encoreTextView != null) {
            i = R.id.benefit_list;
            RecyclerView recyclerView = (RecyclerView) vie1.m85629k(viewInflate, R.id.benefit_list);
            if (recyclerView != null) {
                i = R.id.bottom_space;
                if (((Space) vie1.m85629k(viewInflate, R.id.bottom_space)) != null) {
                    i = R.id.primary_button;
                    EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewInflate, R.id.primary_button);
                    if (encoreButton != null) {
                        i = R.id.secondary_button;
                        EncoreButton encoreButton2 = (EncoreButton) vie1.m85629k(viewInflate, R.id.secondary_button);
                        if (encoreButton2 != null) {
                            i = R.id.separator;
                            View viewM85629k = vie1.m85629k(viewInflate, R.id.separator);
                            if (viewM85629k != null) {
                                i = R.id.title;
                                TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.title);
                                if (textView != null) {
                                    i = R.id.top_space;
                                    if (((Space) vie1.m85629k(viewInflate, R.id.top_space)) != null) {
                                        this.f118130b = new twy((ConstraintLayout) viewInflate, encoreTextView, recyclerView, encoreButton, encoreButton2, viewM85629k, textView, 15);
                                        g79 g79Var = new g79();
                                        g79Var.f77213f = lau.f131415a;
                                        g79Var.f77212e = false;
                                        this.f118131c = g79Var;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        twy twyVar = this.f118130b;
        ((ConstraintLayout) twyVar.f224510b).setOnClickListener(new jxo(9, gh00Var));
        this.f118131c.f77214g = new jpj(24, gh00Var);
        ((EncoreButton) twyVar.f224513e).setOnClickListener(new jxo(10, gh00Var));
        ((EncoreButton) twyVar.f224514f).setOnClickListener(new jxo(11, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        k79 k79Var = (k79) obj;
        String str = k79Var.f120020d;
        String str2 = k79Var.f120019c;
        twy twyVar = this.f118130b;
        ((EncoreTextView) twyVar.f224511c).setVisibility(8);
        ((TextView) twyVar.f224516h).setText(k79Var.f120017a);
        RecyclerView recyclerView = (RecyclerView) twyVar.f224512d;
        EncoreButton encoreButton = (EncoreButton) twyVar.f224514f;
        EncoreButton encoreButton2 = (EncoreButton) twyVar.f224513e;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ArrayList arrayList = k79Var.f120018b;
        g79 g79Var = this.f118131c;
        g79Var.f77213f = arrayList;
        g79Var.f77212e = false;
        g79Var.m47712h();
        recyclerView.setAdapter(g79Var);
        Context context = this.f118129a;
        ((GradientDrawable) ((ConstraintLayout) twyVar.f224510b).getBackground()).setStroke((int) context.getResources().getDimension(R.dimen.benefits_list_card_stroke_width), context.getColor(R.color.benefit_list_default_color));
        if (str2.length() > 0) {
            encoreButton2.setVisibility(0);
            encoreButton2.setText(str2);
            encoreButton2.setBackgroundTintList(ColorStateList.valueOf(-1));
        }
        if (str.length() <= 0) {
            encoreButton.setVisibility(8);
        } else {
            encoreButton.setVisibility(0);
            encoreButton.setText(str);
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        return (ConstraintLayout) this.f118130b.f224510b;
    }
}
