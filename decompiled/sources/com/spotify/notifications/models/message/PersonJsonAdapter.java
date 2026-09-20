package com.spotify.notifications.models.message;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/message/PersonJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/message/Person;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PersonJsonAdapter extends hk60<Person> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6129a = xl60.C2578b.m91389a("username", "display_name", "avatar");

    /* JADX INFO: renamed from: b */
    public final hk60 f6130b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6131c;

    /* JADX INFO: renamed from: d */
    public final hk60 f6132d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor f6133e;

    public PersonJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6130b = p0i0Var.m68706f(String.class, gbuVar, "userName");
        this.f6131c = p0i0Var.m68706f(String.class, gbuVar, "displayName");
        this.f6132d = p0i0Var.m68706f(Avatar.class, gbuVar, "avatar");
    }

    @Override // p204p.hk60
    public final Person fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        Avatar avatar = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6129a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f6130b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("userName", "username", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str2 = (String) this.f6131c.fromJson(xl60Var);
                i &= -3;
            } else if (iMo51071K == 2) {
                avatar = (Avatar) this.f6132d.fromJson(xl60Var);
                i &= -5;
            }
        }
        xl60Var.mo51078f();
        if (i == -7) {
            if (str != null) {
                return new Person(str, str2, avatar);
            }
            throw f0b1.m40461o("userName", "username", xl60Var);
        }
        Constructor declaredConstructor = this.f6133e;
        if (declaredConstructor == null) {
            declaredConstructor = Person.class.getDeclaredConstructor(String.class, String.class, Avatar.class, Integer.TYPE, f0b1.f64588c);
            this.f6133e = declaredConstructor;
        }
        if (str != null) {
            return (Person) declaredConstructor.newInstance(str, str2, avatar, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("userName", "username", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Person person) {
        Person person2 = person;
        if (person2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("username");
        this.f6130b.toJson(rm60Var, person2.userName);
        rm60Var.mo56894s("display_name");
        this.f6131c.toJson(rm60Var, person2.displayName);
        rm60Var.mo56894s("avatar");
        this.f6132d.toJson(rm60Var, person2.avatar);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(28, "GeneratedJsonAdapter(Person)");
    }
}
