package net.threetag.palladiumcore.event;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;

public class LivingEntityEvents {

    public static final Event<Death> DEATH = new Event<>(Death.class, listeners -> (e, s) -> Event.result(listeners, death -> death.livingEntityDeath(e, s)));

    public static final Event<Hurt> HURT = new Event<>(Hurt.class, listeners -> (e, s, a) -> Event.result(listeners, hurt -> hurt.livingEntityHurt(e, s, a)));

    @FunctionalInterface
    public interface Death {

        EventResult livingEntityDeath(LivingEntity entity, DamageSource damageSource);

    }

    @FunctionalInterface
    public interface Hurt {

        EventResult livingEntityHurt(LivingEntity entity, DamageSource damageSource, float amount);

    }

}
