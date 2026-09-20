package p204p;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes3.dex */
public class r73 {

    /* JADX INFO: renamed from: a */
    public final n73 f196422a;

    /* JADX INFO: renamed from: b */
    public final int f196423b;

    public r73(Context context) {
        this(context, s73.m77357f(context, 0));
    }

    /* JADX INFO: renamed from: a */
    public r73 mo74883a(CharSequence[] charSequenceArr, ja5 ja5Var) {
        n73 n73Var = this.f196422a;
        n73Var.f151058o = charSequenceArr;
        n73Var.f151060q = ja5Var;
        n73Var.f151063t = -1;
        n73Var.f151062s = true;
        return this;
    }

    public s73 create() {
        n73 n73Var = this.f196422a;
        s73 s73Var = new s73(n73Var.f151044a, this.f196423b);
        View view = n73Var.f151048e;
        q73 q73Var = s73Var.f206265f;
        if (view != null) {
            q73Var.f186017w = view;
        } else {
            CharSequence charSequence = n73Var.f151047d;
            if (charSequence != null) {
                q73Var.m72283g(charSequence);
            }
            Drawable drawable = n73Var.f151046c;
            if (drawable != null) {
                q73Var.f186013s = drawable;
                ImageView imageView = q73Var.f186014t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    q73Var.f186014t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = n73Var.f151049f;
        if (charSequence2 != null) {
            q73Var.f185999e = charSequence2;
            TextView textView = q73Var.f186016v;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = n73Var.f151050g;
        if (charSequence3 != null) {
            q73Var.m72282f(-1, charSequence3, n73Var.f151051h);
        }
        CharSequence charSequence4 = n73Var.f151052i;
        if (charSequence4 != null) {
            q73Var.m72282f(-2, charSequence4, n73Var.f151053j);
        }
        CharSequence charSequence5 = n73Var.f151054k;
        if (charSequence5 != null) {
            q73Var.m72282f(-3, charSequence5, n73Var.f151055l);
        }
        if (n73Var.f151058o != null || n73Var.f151059p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) n73Var.f151045b.inflate(q73Var.f185989A, (ViewGroup) null);
            int i = n73Var.f151062s ? q73Var.f185990B : q73Var.f185991C;
            ListAdapter p73Var = n73Var.f151059p;
            if (p73Var == null) {
                p73Var = new p73(n73Var.f151044a, i, R.id.text1, n73Var.f151058o);
            }
            q73Var.f186018x = p73Var;
            q73Var.f186019y = n73Var.f151063t;
            if (n73Var.f151060q != null) {
                alertController$RecycleListView.setOnItemClickListener(new m73(n73Var, q73Var));
            }
            if (n73Var.f151062s) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            q73Var.f186000f = alertController$RecycleListView;
        }
        View view2 = n73Var.f151061r;
        if (view2 != null) {
            q73Var.f186001g = view2;
            q73Var.f186002h = false;
        }
        s73Var.setCancelable(true);
        s73Var.setCanceledOnTouchOutside(true);
        s73Var.setOnCancelListener(n73Var.f151056m);
        s73Var.setOnDismissListener(null);
        bhe0 bhe0Var = n73Var.f151057n;
        if (bhe0Var != null) {
            s73Var.setOnKeyListener(bhe0Var);
        }
        return s73Var;
    }

    public Context getContext() {
        return this.f196422a.f151044a;
    }

    public r73 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        n73 n73Var = this.f196422a;
        n73Var.f151052i = n73Var.f151044a.getText(i);
        n73Var.f151053j = onClickListener;
        return this;
    }

    public r73 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        n73 n73Var = this.f196422a;
        n73Var.f151050g = n73Var.f151044a.getText(i);
        n73Var.f151051h = onClickListener;
        return this;
    }

    public r73 setTitle(CharSequence charSequence) {
        this.f196422a.f151047d = charSequence;
        return this;
    }

    public r73 setView(View view) {
        this.f196422a.f151061r = view;
        return this;
    }

    public r73(Context context, int i) {
        this.f196422a = new n73(new ContextThemeWrapper(context, s73.m77357f(context, i)));
        this.f196423b = i;
    }
}
